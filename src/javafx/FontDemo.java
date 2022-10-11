package javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.*;
import javafx.scene.control.*;

public class FontDemo extends Application{
	public void start(Stage primaryStage) {
		// pane to hold circle
		Pane pane = new StackPane();
		
		// create circle
		Circle circle = new Circle();
		circle.setRadius(50);
		circle.setStroke(Color.BLACK);
		circle.setFill(new Color(0.5, 0.5, 0.5, 0.1));
		
		// add circle to pane
		pane.getChildren().add(circle);
		
		// create label
		Label label = new Label("JavaFX");
		label.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 20));
		
		// add label to pane
		pane.getChildren().add(label);
		
		// add pane to scene
		Scene scene = new Scene(pane);
		
		// add scene, title to primaryStage
		primaryStage.setScene(scene);
		primaryStage.setTitle("Font Demo");
		primaryStage.show();
	}
	public static void main (String[]args) {
		launch(args);
	}
}
