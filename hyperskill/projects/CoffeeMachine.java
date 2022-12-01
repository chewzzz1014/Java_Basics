import java.util.Scanner;

class Machine{
	
	int water = 400, milk = 540, coffeeBeans = 120, cups = 9, money = 550;
	State currentState;
	String option;
	Scanner scanner = new Scanner(System.in);
	Machine(){
		
	}
	
	public void checkWantExit(String input) {
		if (input.equals("EXIT"));
		{
			this.currentState = State.valueOf("EXIT");
			System.exit(0);
		}
	}
	
	public void getInput(String input){
		option = input.toUpperCase();
		currentState = State.valueOf(option);
		switch(currentState.name()) {
		case "BUY":
				buy();
			 break;
		case "FILL":
				fill();
			break;
		case "TAKE":
				take();
			break;
		case "REMAINING":
				remaining();
			break;
		case "EXIT":
				System.exit(0);
			break;
		}	// end of switch
	} // end of getInput(str)	
	
	public void buy(){
		System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
		String coffeeOption = scanner.next();
		this.checkWantExit(coffeeOption);
		switch(coffeeOption.charAt(0)){
				case '1':
						if(this.water>=250 && this.coffeeBeans>=16){
							water -= 250;
							coffeeBeans -= 16;
							money += 4;
							cups -= 1;
							System.out.println("I have enough resources, making you a coffee!");
						}
						else{
							if (water<250 && coffeeBeans<16)
								System.out.println("Sorry, not enough water and coffee beans!");
							else if (water<250)
								System.out.println("Sorry, not enough water!");
							else
								System.out.println("Sorry, not enough coffee beans!");
						}
	
						break;
				case '2':
							
						if(water>=350 && milk>=75 && coffeeBeans>=20){
							water -= 350;
							milk -= 75;
							coffeeBeans -= 20;
							money += 7;
							cups -= 1;
							System.out.println("I have enough resources, making you a coffee!");
						}
						else{
							if (water<350 && milk<75 && coffeeBeans<20)
								System.out.println("Sorry, not enough water, milk and coffee beans!");
							else if (water<350 && milk<75)
								System.out.println("Sorry, not enough water and milk!");
							else if (water<350 && coffeeBeans<20)
								System.out.println("Sorry, not enough water and coffee beans!");
							else if (milk<75 && coffeeBeans<20)
								System.out.println("Sorry, not enough milk and coffee beans!");
							else if (milk<75)
								System.out.println("Sorry, not enough water!");
							else if (water<350)
								System.out.println("Sorry, not enough milk!");
							else if (coffeeBeans<20)
								System.out.println("Sorry, not enough coffee beans!");
						}
					
						break;
					
					case '3':	
						if(water>=200 && milk>=100 && coffeeBeans>=12){
								water -= 200;
								milk -= 100;
								coffeeBeans -= 12;
								money += 6;
								cups -= 1;
								System.out.println("I have enough resources, making you a coffee!");
							}
							else{
								if (water<200 && milk<100 && coffeeBeans<12)
									System.out.println("Sorry, not enough water, milk and coffee beans!");
								else if (water<200 && milk<100)
									System.out.println("Sorry, not enough water and milk!");
								else if (water<200 && coffeeBeans<12)
									System.out.println("Sorry, not enough water and coffee beans!");
								else if (milk<100 && coffeeBeans<12)
									System.out.println("Sorry, not enough milk and coffee beans!");
								else if (milk<100)
									System.out.println("Sorry, not enough water!");
								else if (water<200)
									System.out.println("Sorry, not enough milk!");
								else if (coffeeBeans<12)
									System.out.println("Sorry, not enough coffee beans!");
							}
			
							break;
							
					default: break;
					}	// end of switch
	}	// end of method buy

public void fill(){
		String input;
		int i=1;
		String[] prompts = {"ml of water", "ml of milk", "grams of coffee beans", "disposable cups of coffee"};
		for(String p: prompts){
				System.out.println("Write how many "+  p + " you want to add: ");
				input = scanner.next();
				this.checkWantExit(input);
				if (!input.equals("buy"))
				{
					if (i==1)
							water += Integer.parseInt(input);
					else if (i==2)
							milk += Integer.parseInt(input);
					else if (i==3)
							coffeeBeans += Integer.parseInt(input);
					else
							cups += Integer.parseInt(input);
					i++;
				}
				else
					break;
		}
}

public void take(){
	System.out.printf("I give you $1d\n", money);
	money = 0;
}

public void remaining(){
	System.out.printf("\nThe coffee machine has:\n%1d ml of water\n%1d ml of milk\n%1d g of coffee beans\n%1d disposable cups\n$%1d of money\n", water, milk, coffeeBeans, cups, money);
}

enum State{
	BUY, FILL, TAKE, REMAINING, EXIT
}

}


public class CoffeeMachine {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
		Machine m = new Machine();
		String in;
		
		do{
			System.out.println("Write action (buy, fill, take, remaining, exit):");
			in = scanner.next();
			m.getInput(in);
		}while(!m.currentState.name().equals("EXIT"));
		
		
		scanner.close();
    }
}
