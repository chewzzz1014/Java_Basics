// Chew Zi Qing 212360
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

// send radius to server and get area back
public class RMIClient extends Application {
	// server
	private RMIServerInterface circle;

	 // make UI with javafx
	  private Button btGetArea = new Button("Get Area");
	  private TextField tfRadius = new TextField();
	  private TextField tfArea = new TextField();

	  public void start(Stage primaryStage) {
	    GridPane gridPane = new GridPane();
	    gridPane.setHgap(5);
	    gridPane.add(new Label("Radius (cm)"), 0, 0);
	    gridPane.add(new Label("Area (cm)"), 0, 1);
	    gridPane.add(tfRadius, 1, 0);
	    gridPane.add(tfArea, 1, 1);
	    gridPane.add(btGetArea, 1, 2);

	    // showing windows
	    Scene scene = new Scene(gridPane, 250, 250);
	    primaryStage.setTitle("Client"); 
	    primaryStage.setScene(scene);
	    primaryStage.show();
	    
	    initializeRMI();
	    // set event listener. Will send radius to server when clicked
	    btGetArea.setOnAction(e -> getScore());
	  }

	  // get score from input field
	  private void getScore() {
	    try {
	      double area = circle.calcArea(tfRadius.getText().trim());
	      tfArea.setText(area+"");
	    }
	    catch(Exception ex) {
	      ex.printStackTrace();
	      
	      // showing error alert window
	      BorderPane errPane = new BorderPane();
	        errPane.setCenter(new Label("Radius is required!\nPlease Enter Valid Number!"));
	        Scene errScene = new Scene(errPane, 300, 150);
	        Stage errorStage = new Stage();
	        errorStage.setTitle("Error!");
	        errorStage.setScene(errScene);
	        errorStage.show();
	    }
	  }

	  // start the RMI
	  protected void initializeRMI() {
	    String host = "";

	    try {
	      // get remote object Registry for the local host
	      Registry registry = LocateRegistry.getRegistry(host);
	      // find the remote object with the given name
	      circle = (RMIServerInterface)
	        registry.lookup("RMIServerInterfaceImpl");
	      System.out.println("Server object " + circle + " found");
	    }
	    catch(Exception ex) {
	      System.out.println(ex);
	    }
	  }
	  public static void main(String[] args) {
	    launch(args);
	  }
}


/*
 * How to Run
 * 1. cd to working directory
 * 2. Type "start rmiregistry" in cmd
 * 2. Compile and run RegisterWithRMIServer
 * 3. Run Client from eclipse
*/ 

/*
 * If compile and runtime not compatible
 * /*
 * 49 = Java 5
50 = Java 6
51 = Java 7
52 = Java 8
53 = Java 9
54 = Java 10
55 = Java 11
56 = Java 12
57 = Java 13
58 = Java 14
59 = Java 15
60 = Java 16
61 = Java 17
62 = Java 18
63 = Java 19

javac --release 11 yourClass.java
 */
