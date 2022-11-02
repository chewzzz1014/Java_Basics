package javafx;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import java.lang.*;

public class CircleMotion extends Application{
	public void start(Stage primaryStage) {
		
		int sceneWidth = 280, sceneHeight = 200;
		
		Circle circle = new Circle();
		circle.setCenterX(randomCoorX(sceneWidth));
		circle.setCenterY(randomCoorY(sceneHeight));
		circle.setRadius(10);
		circle.setFill(Color.rgb(random255(), random255(), random255()));
		
		Pane pane = new Pane();
		pane.getChildren().add(circle);
		
		Scene scene = new Scene(pane, sceneWidth, sceneHeight);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Circle Motion");
		primaryStage.show();
	}
	public static void main(String[]args) {
		launch(args);
	}
	
	public static int random255() {
		return (int)Math.floor(Math.random()*256);
	}
	
	public static int randomCoorX(int sceneWidth) {
		// center can be positioned between (inclusively) 10 and 270
		// formula: floor(random() * (max-min)) + min
		int min = 10, max = sceneWidth-10;
		return (int)Math.floor(Math.random()*(max-min+1)) + min;
	}
	
	public static int randomCoorY(int sceneHeight) {
		// center can be positioned between (inclusively) 10 and 180
		int min = 10, max = sceneHeight-10;
		return (int)Math.floor(Math.random()*(max-min+1)) + min;
	}
}
