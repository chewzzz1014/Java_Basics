// Chew Zi Qing
package com.example.sem3.database;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

// client that accesses database
public class LabRMIClient extends Application {
  // RMI server instance
  private LabRMIServerInterface student;

  private Button btGetScore = new Button("Get Score");
  private TextField tfName = new TextField();
  private TextField tfScore = new TextField();

  public void start(Stage primaryStage) {
	// javafx ui
    GridPane gridPane = new GridPane();
    gridPane.setHgap(5);
    gridPane.add(new Label("Name"), 0, 0);
    gridPane.add(new Label("Score"), 0, 1);
    gridPane.add(tfName, 1, 0);
    gridPane.add(tfScore, 1, 1);
    gridPane.add(btGetScore, 1, 2);

    // Create a scene and place the pane in the stage
    Scene scene = new Scene(gridPane, 250, 250);
    primaryStage.setTitle("StudentServerInterfaceClient"); 
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
    
    // initialize server
    initializeRMI();
    btGetScore.setOnAction(e -> getScore());
  }

  // event handler for btGetScore that returns gets student's score from server
  private void getScore() {
    try {
      // get user input field
      String input = tfName.getText().trim();
      // make the user input titlecase
      // find the student's score from server
      String score = student.findScore(input.substring(0,1).toUpperCase()
    		  			+input.substring(1).toLowerCase());

      // display score
      tfScore.setText(score);
    }
    catch(Exception ex) {
      ex.printStackTrace();
    }
  }

  /** Initialize RMI */
  protected void initializeRMI() {
    String host = "";

    try {
      Registry registry = LocateRegistry.getRegistry(host);
      student = (LabRMIServerInterface)
        registry.lookup("LabRMIServerInterfaceImpl");
      System.out.println("Server object " + student + " found");
    }
    catch(Exception ex) {
      System.out.println(ex);
    }
  }

  public static void main(String[] args) {
    launch(args);
  }
}
