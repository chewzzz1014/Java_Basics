package javafx;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;

public class MultipleStage extends Application{
	public void start(Stage primaryStage) {
		Scene scene = new Scene(new Button("primary scene"), 250, 250);
		primaryStage.setTitle("This is primary stage");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		Stage stage = new Stage();
		stage.setScene(new Scene(new Button("another scene"), 50, 50));
		stage.setTitle("This is another stage");
		stage.show();
		
		primaryStage.show();
	}
	
	public static void main (String[]args) {
		launch(args);
	}
}
