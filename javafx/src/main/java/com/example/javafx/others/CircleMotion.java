package com.example.javafx.others;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.scene.layout.Pane;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.event.*;
import javafx.scene.input.MouseEvent;
import java.util.Date;
import javafx.scene.text.Text;
import javafx.geometry.Insets;

public class CircleMotion extends Application{
		// to be read and modified by inner class (mouse event handler)
		private int sceneWidth = 280, sceneHeight = 200;
		private int count = 1;
		private Date start, end;
		private long diff;
		private Circle circle = new Circle();
		private Scene scene;
		private Pane pane;
		
	public void start(Stage primaryStage) {
		// set radius, center coordinates and color of circle. Coordinates and color are random
		circle.setCenterX(randomCoorX(sceneWidth));
		circle.setCenterY(randomCoorY(sceneHeight));
		circle.setRadius(10);
		circle.setFill(Color.rgb(random255(), random255(), random255()));
		
		// add mouse event handler for circle
		circle.setOnMouseClicked(new CircleHandler());
		
		// add circle to pane
		pane = new Pane();
		pane.getChildren().add(circle);
		
		// set up scene and show scene
		scene = new Scene(pane, sceneWidth, sceneHeight);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Circle Motion");
		primaryStage.show();
		
		// start to count the time when the moment program is ran
		start = new Date();
	}
	public static void main(String[]args) {
		launch(args);
	}
	
	// generate random number from 0 to 255 (both inclusively)
	// for generating random color
	public static int random255() {
		return (int)Math.floor(Math.random()*256);
	}
	
	// generate random x coordinates for center of circle
	// can be used for any width of scene
	public static int randomCoorX(int sceneWidth) {
		// center can be positioned between (inclusively) 10 and 270
		// formula: floor(random() * (max-min)) + min
		int min = 10, max = sceneWidth-10;
		return (int)Math.floor(Math.random()*(max-min+1)) + min;
	}
	
	// generate random y coordinates for center of circle
	public static int randomCoorY(int sceneHeight) {
		// center can be positioned between (inclusively) 10 and 180
		int min = 10, max = sceneHeight-10;
		return (int)Math.floor(Math.random()*(max-min+1)) + min;
	}
	
	
	// inner class: event handler for clicking on circle
	class CircleHandler implements EventHandler<MouseEvent>{
		public void handle(MouseEvent e) {
			// keep changing the coordinates and colour of circle
			if (count < 20) {
				circle.setCenterX(randomCoorX(sceneWidth));
				circle.setCenterY(randomCoorY(sceneHeight));
				//circle.setRadius(10);
				circle.setFill(Color.rgb(random255(), random255(), random255()));
				count ++;
				System.out.println(count);
			}else if (count==20) {
				// count the time difference between start time and end time (after 20 circles clicked)
				// show the time spent on a new window
				end = new Date();
				diff = end.getTime() - start.getTime();
				String output = "Time spent is " + diff + " milliseconds";
				
				BorderPane endPane = new BorderPane();
				endPane.setCenter(new Text(output));
				
				//scene = new Scene(endPane);
				
				//Scene scene = new Scene(pane, sceneWidth, sceneHeight);
				//Stage stage = new Stage();
				
				pane.getChildren().remove(circle);
				pane.setPadding(new Insets(20, 20, 20, 20));
				pane.getChildren().add(endPane);
		}	
	}
	}
	
}