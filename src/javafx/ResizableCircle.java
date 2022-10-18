package javafx;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;


public class ResizableCircle extends Application {
	
	public CirclePane circlePane = new CirclePane();
	
	public void start(Stage primaryStage) {
		StackPane pane = new StackPane();
		Circle circle = new Circle(50);
		circle.setStroke(Color.BLACK);
		circle.setFill(Color.WHITE);
		pane.getChildren().add(circle);
		
		// create box
		HBox hBox = new HBox();
		hBox.setSpacing(10);
		hBox.setAlignment(Pos.CENTER);
		
		// create button and add buttons to box
		Button btEnlarge = new Button("Enlarge");
		Button btShrink = new Button ("Shrink");
		hBox.getChildren().add(btEnlarge);
		hBox.getChildren().add(btShrink);
		
		// create and register handler
		btEnlarge.setOnAction(new EnlargeHandler());
		btShrink.setOnAction(new ShrinkHandler());
		
		// create pane and put box to pane
		BorderPane borderPane = new BorderPane();
		borderPane.setCenter(pane);
		borderPane.setBottom(hBox);
		borderPane.setAlignment(hBox, Pos.CENTER);
		
		Scene scene = new Scene(borderPane, 200, 150);
		primaryStage.setTitle("Control Circle");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	
	// inner class. these two handlers are for Resizable circle only
	class EnlargeHandler implements EventHandler<ActionEvent>{
		public void handle(ActionEvent e) {
			circlePane.enlarge();
		}
	}

	class ShrinkHandler implements EventHandler<ActionEvent>{
		public void handle(ActionEvent e) {
			circlePane.shrink();
		}
	}

	public static void main (String[]args) {
		launch(args);
	}
}


class CirclePane extends StackPane{
	private Circle circle = new Circle(50);
	
	public CirclePane() {
		getChildren().add(circle);
		circle.setStroke(Color.BLACK);
		circle.setFill(Color.WHITE);
	}
	
	public void enlarge() {
//		System.out.println(circle.getRadius());
		circle.setRadius(circle.getRadius() + 2);
	}
	
	public void shrink() {
		circle.setRadius(circle.getRadius() > 2? circle.getRadius()-2: circle.getRadius());
	}
}
