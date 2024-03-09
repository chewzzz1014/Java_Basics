package com.example.javafx.others;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

public class EightQueens extends Application {
  public static final int SIZE = 8; // The size of the chess board

  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
 
    int count = 1;
    // start 8 threads on 8 different columns respectively
    for (int i=-1; i<=6; i++) {
    	new Thread(new FindSolution(count, i)).start();
    	count++;
    }
  }

  /** Search for a solution */
  private boolean search(int[] queens) {
    // k is the current row to be considered
    // We are looking for a position in the kth row to place a queen
	  
    int k = 0;
    while (k >= 0 && k < SIZE) {
      // Find a position to place a queen in the kth row
      int j = findPosition(k, queens);
      if (j < 0) {
        queens[k] = -1;
        k--; // Backtrack to the previous row
      } else {
        queens[k] = j;
        k++;
      }
    }
    
    if (k == -1)
      return false; // No solution
    else
      return true; // A solution is found
  }

  public int findPosition(int k, int[] queens) {
    int start = queens[k] + 1; // Search for a new placement

    for (int j = start; j < SIZE; j++) {
      if (isValid(k, j, queens))
        return j; // (k, j) is the place to put the queen now
    }

    return -1;
  }
  
  /** Return true if a queen can be placed at (row, column) */
  public boolean isValid(int row, int column, int[] queens) {
    for (int i = 1; i <= row; i++)
      if (queens[row - i] == column // Check column
        || queens[row - i] == column - i // Check upleft diagonal
        || queens[row - i] == column + i) // Check upright diagonal
        return false; // There is a conflict
    return true; // No conflict
  }

  /**
   * The main method is only needed for the IDE with limited
   * JavaFX support. Not needed for running from the command line.
   */
  public static void main(String[] args) {
    launch(args);
  }
  
  // inner class inside EightQueens class
  class FindSolution implements Runnable{
	
	  // row coordinates of queens
	  int[] queens = {-1, -1, -1, -1, -1, -1, -1, -1};
	  Stage myStage = new Stage();
	  int count;
	  
		public FindSolution(int count, int i) {
			// move queen of first row to n-th column
			queens[0] = i;
			// to know we're in which thread (column)
			this.count = count;
		}
		
		// this method will be executed when the thread is started
		public void run() {			
			// find the coordinates for all queens
			search(this.queens);
			
			// display all queens on the chess board
			Platform.runLater(new Runnable() {
    			public void run() {
    				GridPane chessBoard = new GridPane();
    			    chessBoard.setAlignment(Pos.CENTER);
    			    Label[][] labels = new Label[SIZE][SIZE];
    			    
    			    // styling the board box
    			    for (int i = 0; i < SIZE; i++)
    			      for (int j = 0; j < SIZE; j++) {
    			        chessBoard.add(labels[i][j] = new Label(), j, i);
    			        labels[i][j].setStyle("-fx-border-color: black");
    			        labels[i][j].setPrefSize(55, 55);
    			      }

    			    // Display queens on box
    			    Image image = new Image("https://liveexample.pearsoncmg.com/common/image/queen.jpg");
    			    for (int i = 0; i < SIZE; i++)
    			    		labels[i][queens[i]].setGraphic(new ImageView(image));
    			    
    			    // display the board
    			    Scene scene = new Scene(chessBoard, 55 * SIZE, 55 * SIZE);
    			    myStage.setTitle("EightQueens Column "+count); // Set the stage title
    			    myStage.setScene(scene); // Place the scene in the stage
    			    myStage.show(); // Display the stage
    			}
    		});
			
		}
	}
  
}

