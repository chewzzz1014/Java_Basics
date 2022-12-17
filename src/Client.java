
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

public class Client extends Application {
  // to send multiple data
  DataOutputStream toServer = null;
  DataInputStream fromServer = null;

  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
    // Panel p to hold the label and text field
    GridPane inputFields = new GridPane();
    inputFields.setPadding(new Insets(5, 5, 5, 5)); 
    inputFields.setStyle("-fx-border-color: green");
    
    TextField heightTf = new TextField();
    inputFields.add(new Label("Enter Height (m): "), 0, 0);
    inputFields.add(heightTf, 1, 0);
    inputFields.add(new Label("Enter Weight (kg): "), 0, 1);
    TextField weightTf = new TextField();
    inputFields.add(weightTf, 1, 1);
    
    Button submitBtn = new Button("Submit");
    submitBtn.setPrefWidth(150);
    inputFields.add(submitBtn, 1, 2);
    
    TextField tf = new TextField();
    tf.setAlignment(Pos.BOTTOM_RIGHT);
    
    BorderPane mainPane = new BorderPane();
    // Text area to display contents
    TextArea ta = new TextArea();
    mainPane.setCenter(new ScrollPane(ta));
    mainPane.setTop(inputFields);
    
    // Create a scene and place it in the stage
    Scene scene = new Scene(mainPane, 450, 200);
    primaryStage.setTitle("Client"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
    
    submitBtn.setOnAction(e -> {
      try {
        // Get the radius from the text field
        double height = Double.parseDouble(heightTf.getText().trim());
        double weight = Double.parseDouble(weightTf.getText().trim());
  
        // Send the radius to the server
        toServer.writeDouble(height);
        toServer.writeDouble(weight);
        toServer.flush();
  
        // Get area from the server
        double bmi = fromServer.readDouble();
  
        // Display to the text area
        ta.appendText("Height: " 
                + height + "m\n"+"Weight: "+weight+"kg \n");
        ta.appendText("BMI received from the server is "
          + String.format("%.2f", bmi) + "\n\n");
      }
      catch (Exception ex) {
        System.err.println(ex);
        
        BorderPane errPane = new BorderPane();
        errPane.setCenter(new Label("Make sure:\n- Provide both height and weight!\n- Height and weight are number!"));
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
      // Socket socket = new Socket("130.254.204.36", 8000);
      // Socket socket = new Socket("drake.Armstrong.edu", 8000);

      // Create an input stream to receive data from the server
      fromServer = new DataInputStream(socket.getInputStream());

      // Create an output stream to send data to the server
      toServer = new DataOutputStream(socket.getOutputStream());
    }
    catch (IOException ex) {
      ta.appendText(ex.toString() + '\n');
    }
  }

  /**
   * The main method is only needed for the IDE with limited
   * JavaFX support. Not needed for running from the command line.
   */
  public static void main(String[] args) {
    launch(args);
  }
}