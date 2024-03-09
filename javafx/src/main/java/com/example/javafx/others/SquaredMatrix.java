package com.example.javafx.others;

// import classes needed
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class SquaredMatrix extends Application {
	  @Override // Override the start method in the Application class
	  public void start(Stage primaryStage) {
		  
	   // create pane for 2-dimensional grid
	   GridPane pane = new GridPane();
	   
	   // using nested for loops to add 100 text fields
	   for (int i=0; i<10; i++) {
		   for (int j=0; j<10; j++) {
			   
			   // create text field
			   TextField userTextField = new TextField();
			   
			   // set text field's width
		       userTextField.setPrefWidth(25);
		       
		       // fill in text field with either 0 or 1 (in String)
		       userTextField.setText(""+ (int)(Math.random()*2));
		       
		       // add the text field to the pane
		       // i is x coordinate and j is y coordinate
			   pane.add(userTextField, i, j); 
		   }
	   }
	   
	   // place pane in the scene
	   Scene scene = new Scene(pane);
	   
	   // place the screen in stage
	   primaryStage.setScene(scene);
	   
	   // set stage's title
	   primaryStage.setTitle("Squared Matrix");
	   
	   // display the stage
	   primaryStage.show();
	  }
	  
	  // generate 0 or 1 randomly
	  public static int randomNum() {
			int n = (int)(Math.random()*2);
			// convert int to string and return it
			return n;
		}
	  
	  public static void main(String[] args) { 
	    launch(args);
	  }
	}
