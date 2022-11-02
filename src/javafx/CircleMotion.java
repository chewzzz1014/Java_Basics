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
		
		Circle circle = new Circle();
		circle.setCenterX(randomCoorX());
		circle.setCenterY(randomCoorY());
		circle.setRadius(10);
		circle.setFill(Color.rgb(random255(), random255(), random255()));
		
		Pane pane = new Pane();
		pane.getChildren().add(circle);
		
		Scene scene = new Scene(pane, 280, 200);
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
	
	public static int randomCoorX() {
		// center be be positioned between (inclusively) 10 and 270
		// formula: floor(random() * (max-min)) + min
		return (int)Math.floor(Math.random()*261) + 10;
	}
	
	public static int randomCoorY() {
		// center be be positioned between (inclusively) 10 and 180
		return (int)Math.floor(Math.random()*171) + 10;
	}
}
