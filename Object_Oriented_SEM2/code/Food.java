package code;
// Week 2
// CHEW ZI QING 212360
public class Food {
	
	//data fields of class Food
	private String item;
	private double totalCalories;
	private double fat;
	private double caloriesFromFat = 0;
	private double percentageOfCaloriesFromFat =  0 ;
	
	// constructor 1 that accepts no argument
	Food(){
	}
	
	// constructor 2 that accepts 3 arguments
	Food(String item, double totalCalories, double fat ){
		this.item = item;
		this.totalCalories = totalCalories;
		this.fat = fat;
	}
	
	// constructor 3 that accepts 1 arguments
	Food(String item)
		{this.item = item;}
	
	// constructor 4 that accepts 2 arguments
	Food(String item, double totalCalories){
		this.item = item;
		this.totalCalories = totalCalories;
	}
	
	// setter method for private data fields of this class
	void setItem(String item) {
		this.item = item;
	}
	
	void setTotalCalories(double totalCalories) {
		this.totalCalories = totalCalories;
	}
	
	void setFat(double fat) {
		this.fat = fat;
	}
	
	//accessor methods for private data fields of this class
	String getItem() {
		return item;
	}
	
	double getTotalCalories() {
		return totalCalories;
	}
	
	double getFat() {
		return fat;
	}
	
	
	//calculate caloriesFromFat and percentageOfCaloriesFromFat. Both of these methods will assign and return respective data field
	
	double calcGetCaloriesFromFat() {		//acts as calculate function as well as accessor of caloriesFromFat
		if (caloriesFromFat == 0)	//if caloriesFromFat hasn't been calculated, calculate it
			caloriesFromFat = fat*9;
		return caloriesFromFat;		
	}
	
	double calcGetPercentageOfCaloriesFromFat() {	//acts as calculate function as well as accessor of percentageOfCaloriesFromFat
		if (percentageOfCaloriesFromFat == 0)		//if percentageOfCaloriesFromFat hasn't been calculated, calculate it
			percentageOfCaloriesFromFat = ( caloriesFromFat / totalCalories )*100;
		return percentageOfCaloriesFromFat;
	}
	
	
	// checking whether the input is valid or invalid 
	String checkIsValid() {
		if ( caloriesFromFat>totalCalories )
			return ("INVALID INPUT!");
		else
			return "VALID INPUT";
	}
	
	// checking whether the food item is low fat or high fat
	String checkIsLowFat() {
		if ( percentageOfCaloriesFromFat < 30 )
			return ("LOW FAT FOOD");
		else
			return "HIGH FAT FOOD. REDUCE YOUR INTAKE";
	}
	
}
