package javafx;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Label;
import javafx.geometry.Pos;
import javafx.geometry.HPos;
import javafx.geometry.Insets;

public class RoadSpeeders extends Application{
	public void start(Stage primaryStage) {
		
		GridPane pane = new GridPane();
		pane.setAlignment(Pos.CENTER);
		pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
		pane.setHgap(5.5);
		pane.setVgap(5.5);
		
		
		ToggleGroup vehicleTypes = new ToggleGroup();
		RadioButton carRadio = new RadioButton("Car");
		RadioButton bikeRadio = new RadioButton("Bike");
		carRadio.setToggleGroup(vehicleTypes);
		bikeRadio.setToggleGroup(vehicleTypes);
		
		TextField speed = new TextField();
		TextField speedLimit = new TextField();
		Button btSubmit = new Button("Submit");

		pane.add(new Label("Vehicle Type"), 0, 0);
		pane.add(carRadio, 1, 0);
		pane.add(bikeRadio, 2, 0);
		pane.add(new Label("Speed Limit (km/h)"), 0, 1);
		pane.add(speedLimit, 1, 1);
		pane.add(new Label("Speed (km/h)"), 0, 2);
		pane.add(speed, 1, 2);
		pane.add(btSubmit, 1, 3);
		
		Scene scene = new Scene(pane);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Road Speeder");
		primaryStage.show();
	}
	
	public static void main (String[]args) {
		launch(args);
	}
}
