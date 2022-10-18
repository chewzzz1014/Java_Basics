package javafx;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.geometry.Pos;
import javafx.geometry.HPos;

public class RoadSpeeders extends Application{
	public void start(Stage primaryStage) {
		
		GridPane pane = new GridPane();
		pane.setAlignment(Pos.CENTER);
		
		RadioButton carRadio = new RadioButton("Car");
		
		TextField speed = new TextField();
		TextField speedLimit = new TextField();
		Button btSubmit = new Button("Submit");
		
		pane.add(btSubmit, 0, 0);
		
		Scene scene = new Scene(pane);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Road Speeder Fine Calculator");
		primaryStage.show();
	}
	
	public static void main (String[]args) {
		launch(args);
	}
}
