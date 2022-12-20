// Chew Zi Qing 212360
import java.io.*;
import java.net.*;
import java.util.Date;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

// Server that calculates BMI based on height and weight given by client
public class BMIServer extends Application {
  public void start(Stage primaryStage) {
    // Text area for logging
    TextArea ta = new TextArea();

    // Create a scene and place it in the stage
    Scene scene = new Scene(new ScrollPane(ta), 450, 200);
    primaryStage.setTitle("Server"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
    
    new Thread( () -> {
      try {
        // Create a server socket and launch server
        ServerSocket serverSocket = new ServerSocket(8000);
        
        // logging message after started server
        Platform.runLater(() ->
          ta.appendText("Server started at " + new Date() + '\n'));
  
        // Listen for a connection request
        Socket socket = serverSocket.accept();
  
        // Create data input and output streams
        DataInputStream inputFromClient = new DataInputStream(
          socket.getInputStream());
        DataOutputStream outputToClient = new DataOutputStream(
          socket.getOutputStream());
  
        // constantly listening for client's request
        while (true) {
          // get height and weight from the client
          double height = inputFromClient.readDouble();
          double weight = inputFromClient.readDouble();
  
          // calculate BMI
          double bmi = weight/(height*height);
  
          // send BMI back to the client
          outputToClient.writeDouble(bmi);
  
          // update log
          Platform.runLater(() -> {
            ta.appendText("Height received from client: " 
              + height + "m\n"+"Weight received from client: "+weight+"kg \n");
            ta.appendText("BMI is: " + String.format("%.2f", bmi) + "\n\n"); 
          });
        }
      }
      catch(IOException ex) {
        ex.printStackTrace();
      }
    }).start();
  }
  public static void main(String[] args) {
    launch(args);
  }
}