// Week 2
public class TestFood {
	public static void main (String[]args) {
		
		//create objects of class Food using different constructor
		Food food1 = new Food();
		food1.setItem("Crunchy Peanut");
		food1.setTotalCalories(539.7);
		food1.setFat(32.22);
		foodDetails(food1);
		
		Food food2 = new Food("Muruku");
		food2.setTotalCalories(111.0);
		food2.setFat(7.00);
		foodDetails(food2);
		
		Food food3 = new Food("Food A", 211.0 );
		food3.setFat(7.00);
		foodDetails(food3);
				
		Food food4 = new Food("Nasi Lemak", 644.0, 83.0);
		foodDetails(food4);
		
	}
	
	public static void foodDetails(Food f) {
		
		//print all the data fields of object from class Food
		char symbol = '%';
		System.out.printf("Food Item: %1s\nTotal Calories: %.1f\nFat (grams): %.2f\nCalories from fat: %.2f\nPercentage of calories from fat: %.2f%1c\n", f.getItem(), f.getTotalCalories(), f.getFat(), f.calcGetCaloriesFromFat(), f.calcGetPercentageOfCaloriesFromFat(), symbol);
		
		System.out.print(f.checkIsValid()+"\n");
		System.out.print(f.checkIsLowFat());
		
		System.out.println("\n**************************************************\n");
		
	}
}
