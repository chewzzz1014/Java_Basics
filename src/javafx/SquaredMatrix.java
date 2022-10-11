package javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;



public class SquaredMatrix extends Application {
	  @Override // Override the start method in the Application class
	  public void start(Stage primaryStage) {
		  
	   // create pane
	   GridPane pane = new GridPane();
	   
	   // using nested for loops to add 100 textfields
	   for (int i=0; i<10; i++) {
		   for (int j=0; j<10; j++) {
			   
			   // create text field
			   TextField userTextField = new TextField();
			   
			   // set text field's width
		       userTextField.setPrefWidth(25);
		       
		       // fill in text field with either 0 or 1 (in String)
		       userTextField.setText(randomNum());
		       
		       // add the text field to the pane
		       // i is x coordinate and j is y coordinate
			   pane.add(userTextField, i, j); 
		   }
	   }
	   
	   // place pane in the scene
	   Scene scene = new Scene(pane);
	   
	   // place the screen in stage
	   primaryStage.setScene(scene);
	   
	   // display the stage
	   primaryStage.show();
	  }
	  
	  // generate 0 or 1 randomly
	  public static String randomNum() {
			int n = (int)(Math.random()*2);
			// convert int to string and return it
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
