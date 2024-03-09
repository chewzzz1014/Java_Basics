package com.example.javafx.others;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;


public class HandleEveent extends Application {
	public void start(Stage primaryStage) {
		HBox pane = new HBox();
		pane.setAlignment(Pos.CENTER);
		
		Button btOk = new Button("OK");
		Button btCancel = new Button("CANCEL");
		
		OKHandlerClass handler1 = new OKHandlerClass();
		btOk.setOnAction(handler1);
		
		CancelHandlerClass handler2 = new CancelHandlerClass();
		btCancel.setOnAction(handler2);
		
		pane.getChildren().addAll(btOk, btCancel);
		
		Scene scene = new Scene(pane);
		primaryStage.setTitle("Handling Event...");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	public static void main (String[]args) {
		launch(args);
	}
}

class OKHandlerClass implements EventHandler<ActionEvent>{
	@Override
	public void handle(ActionEvent e) {
		System.out.println(e);
	}
}

class CancelHandlerClass implements EventHandler<ActionEvent>{
	@Override
	public void handle(ActionEvent e) {
		System.out.println(e);
	}
}
