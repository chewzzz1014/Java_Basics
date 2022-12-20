// Chew Zi Qing 212350
import java.io.*;
import java.net.*;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class BMIClient extends Application {
  // for sending data to and receive data from server
  DataOutputStream toServer = null;
  DataInputStream fromServer = null;

  @Override 
  public void start(Stage primaryStage) {
    // input field pane
    GridPane inputFields = new GridPane();
    inputFields.setPadding(new Insets(5, 5, 5, 5)); 
    inputFields.setStyle("-fx-border-color: green");
    
    // add height and weight textfields
    TextField heightTf = new TextField();
    inputFields.add(new Label("Enter Height (m): "), 0, 0);
    inputFields.add(heightTf, 1, 0);
    inputFields.add(new Label("Enter Weight (kg): "), 0, 1);
    TextField weightTf = new TextField();
    inputFields.add(weightTf, 1, 1);
    
    // add button
    Button submitBtn = new Button("Submit");
    submitBtn.setPrefWidth(150);
    inputFields.add(submitBtn, 1, 2);
    // add loggging field
    TextField tf = new TextField();
    tf.setAlignment(Pos.BOTTOM_RIGHT);
    
    // add all components to the mainPane
    BorderPane mainPane = new BorderPane();
    TextArea ta = new TextArea();
    mainPane.setCenter(new ScrollPane(ta));
    mainPane.setTop(inputFields);
    
    // Create a scene and place it in the stage
    Scene scene = new Scene(mainPane, 450, 200);
    primaryStage.setTitle("Client"); 
    primaryStage.setScene(scene); 
    primaryStage.show(); 
    
    // add button event listener
    submitBtn.setOnAction(e -> {
      try {
        // get height and weight from text fields
        double height = Double.parseDouble(heightTf.getText().trim());
        double weight = Double.parseDouble(weightTf.getText().trim());
  
        // send height and weight to server
        toServer.writeDouble(height);
        toServer.writeDouble(weight);
        toServer.flush();
  
        // get bmi from the server
        double bmi = fromServer.readDouble();
  
        // Display result to log
        ta.appendText("Height: " 
                + height + "m\n"+"Weight: "+weight+"kg \n");
        ta.appendText("BMI received from the server is "
          + String.format("%.2f", bmi) + "\n\n");
      }
      catch (Exception ex) {
    	// create a new window when:
    	// user skip weight or height
    	// user enter non-numeric input for weight/height fields
        System.err.println(ex);
        
        // display the error warning window
        BorderPane errPane = new BorderPane();
        errPane.setCenter(new Label("Make sure:\n- Provide both height "
        		+ "and weight!\n- Height and weight are number!"));
        Scene errScene = new Scene(errPane, 300, 150);
        Stage errorStage = new Stage();
        errorStage.setTitle("Error!");
        errorStage.setScene(errScene);
        errorStage.show();
      }
    });
  
    try {
      // Create a socket to connect to the server
      Socket socket = new Socket("localhost", 8000);

      // Create an input stream to receive data from the server
      fromServer = new DataInputStream(socket.getInputStream());

      // Create an output stream to send data to the server
      toServer = new DataOutputStream(socket.getOutputStream());
    }
    catch (IOException ex) {
      ta.appendText(ex.toString() + '\n');
    }
  }
  public static void main(String[] args) {
    launch(args);
  }
}