package javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;



public class SquaredMatrix extends Application {
	  @Override // Override the start method in the Application class
	  public void start(Stage primaryStage) {
	   GridPane pane = new GridPane();
	   
	   for (int i=0; i<10; i++) {
		   for (int j=0; j<10; j++) {
			   TextField userTextField = new TextField();
		       userTextField.setPrefWidth(25);
		       userTextField.setText(randomNum());
			   pane.add(userTextField, i, j); 
		   }
	   }
	   
	   Scene scene = new Scene(pane);
	   primaryStage.setScene(scene);
	   primaryStage.show();
	  }
	  
	  public static String randomNum() {
			int n = (int)(Math.random()*2);
			return Integer.toString(n);
		}
	  
	  /**
	   * The main method is only needed for the IDE with limited
	   * JavaFX support. Not needed for running from the command line.
	   */
	  public static void main(String[] args) { 
	    launch(args);
	  }
	}
