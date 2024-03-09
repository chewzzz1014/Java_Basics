package com.example.javafx.others;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Label;
import javafx.scene.text.Text;
import javafx.geometry.Pos;
import javafx.geometry.Insets;

public class RoadSpeeders extends Application{
	public void start(Stage primaryStage) {
		
		// set up grid pane with padding
		GridPane pane = new GridPane();
		pane.setAlignment(Pos.CENTER);
		pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
		pane.setHgap(5.5);
		pane.setVgap(5.5);
		
		// create radio buttons and add them to radio button group
		// make sure that user can only choose one option
		ToggleGroup vehicleTypes = new ToggleGroup();
		RadioButton carRadio = new RadioButton("Car");
		RadioButton bikeRadio = new RadioButton("Bike");
		carRadio.setToggleGroup(vehicleTypes);
		bikeRadio.setToggleGroup(vehicleTypes);
		
		// creating textfields
		TextField speedTF = new TextField();
		TextField speedLimitTF = new TextField();
		Button btSubmit = new Button("Submit");

		// add nodes to pane
		pane.add(new Label("Vehicle Type"), 0, 0);
		pane.add(carRadio, 1, 0);
		pane.add(bikeRadio, 2, 0);
		pane.add(new Label("Speed Limit (km/h)"), 0, 1);
		pane.add(speedLimitTF, 1, 1);
		pane.add(new Label("Speed (km/h)"), 0, 2);
		pane.add(speedTF, 1, 2);
		pane.add(btSubmit, 2, 2);
		pane.add(new Label("Total Fine (RM)"), 0, 3);
		TextField fineTF = new TextField();
		pane.add(fineTF, 1, 3);
		
		// lambda function as event handler of clicking the submit button
		btSubmit.setOnAction(e-> {
			// make sure that users choose all options and inputed valid values (number)
			try {
				RadioButton seletedVehicleRadioButton = (RadioButton) vehicleTypes.getSelectedToggle();
				String vehicle = seletedVehicleRadioButton.getText();
				double speed = Double.parseDouble(speedTF.getText());
				double speedLimit = Double.parseDouble(speedLimitTF.getText());
				
				//if (vehicle.equals("Car")) {
				if (seletedVehicleRadioButton == carRadio) {
					Car car = new Car(speed, speedLimit);
					fineTF.setText( String.format("%.2f", car.getFine()) );
				} else {
					Bike bike = new Bike(speed, speedLimit);
					fineTF.setText( String.format("%.2f", bike.getFine()) );
				}
				
			} catch(Exception err) {
				// create new window to warn user that something wrong
				BorderPane warnPane = new BorderPane();
				warnPane.setCenter(new Text("Error!\nCheck your input again.\nMake sure that you have:\n\n - selected all options\n - inputted correct values!"));
				warnPane.setPrefWidth(50);
				
				Scene scene1 = new Scene(warnPane, 250, 250);
				Stage stage = new Stage();
				stage.setScene(scene1);
				stage.show();
			}
		});
		
		Scene scene = new Scene(pane);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Road Speeder");
		primaryStage.show();
	}
	
	public static void main (String[]args) {
		launch(args);
	}
}
