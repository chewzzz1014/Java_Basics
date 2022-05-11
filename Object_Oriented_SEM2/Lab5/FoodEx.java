package Lab5;
// Week 7
// CHEW ZI QING 212360
public class FoodEx {
	
	private String item;
	private double totalCalories, fat, caloriesFromFat, percentageOfCaloriesFromFat;
	
	FoodEx(){
	}
	
	FoodEx(String item, double totalCalories, double fat ){
		this.setItem(item);
		this.setTotalCalories(totalCalories);
		this.setFat(fat);
	}

	void setItem  (String item) {
		this.item = item;
	}
	
	void setTotalCalories(double totalCalories) {
		this.totalCalories = totalCalories;
	}
	
	void setFat(double fat) {
		this.fat = fat;
	}
	
	String getItem() {
		return item;
	}
	
	double getTotalCalories() {
		return totalCalories;
	}
	
	double getFat() {
		return fat;
	}
	
	/////////////////////////////////////////////////////////////
	
	void calcCaloriesFromFat() {			
		this.caloriesFromFat = fat*9;		
	}
	
	double getCaloriesFromFat() {
		return this.caloriesFromFat;
	}
	
	void calcPercentageOfCaloriesFromFat () {
		if (this.getTotalCalories() == 0) throw new ArithmeticException ("Can't divide by 0.");
		this.percentageOfCaloriesFromFat = ( this.getCaloriesFromFat() / this.getTotalCalories() )*100;
	}
	
	double getPrecentageOfCaloriesFromFat() {
		return this.percentageOfCaloriesFromFat;
	}
	
	
	// checking whether the input is valid or invalid 
	void checkIsValid () throws IllegalArgumentException {
		if ( caloriesFromFat > totalCalories )
			throw new IllegalArgumentException("Somethin wrong with Total Calories or Fat values that you entered.\nCalories From Fat shall not be greater than Total Calories of food."); 
	}
	
	// checking whether the food item is low fat or high fat
	String checkIsLowFat() {
		if ( percentageOfCaloriesFromFat < 30 )
			return ("LOW FAT FOOD");
		else
			return "HIGH FAT FOOD. REDUCE YOUR INTAKE";
	}
	
}

