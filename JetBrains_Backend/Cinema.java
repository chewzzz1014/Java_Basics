import java.util.Scanner;

public class Cinema {

    static int stlpec = 0; //seats
    static int riadok = 0; //row
    static int ticketPrice = 0;


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of rows:");
        riadok = input.nextInt();
        System.out.println("Enter the number of seats in each row:");
        stlpec = input.nextInt();

        String[][] kino = new String[riadok+1][stlpec+1];
        int option;
        int currentIncome = 0;
        int numSeats = riadok*stlpec;
        int numTicketsPurchased=0;
        boolean to_cont = true;
        
        buildArr(kino);
        
        while (to_cont){
            System.out.println("1. Show the seats\n2. Buy a ticket\n3. Statistics\n0. Exit");
            option = input.nextInt();
            switch(option){
                case 1:
                    showSeats(kino);
                    break;
                case 2:
                    currentIncome += buyTicket(input, kino, riadok, stlpec);
                    numTicketsPurchased+=1;
                    break;
                case 3:
                    printStats(numTicketsPurchased, currentIncome, riadok, stlpec);
                    break;
                case 0:
                    to_cont = false;
                    break;
            }
        } // end of while block                    


    }

    public static void printStats(int numTicketsPurchased, int currentIncome, int riadok, int stlpec){
       int numSeats = (int)(riadok*stlpec);
       double perc =  (double)(numTicketsPurchased*100)/(riadok*stlpec);
        
       int totalIncome = calculateProfit(riadok, stlpec);
       System.out.println(numSeats);
        System.out.printf("Number of purchased tickets: %d\nPercentage: %.2f%c\nCurrent income: $%d\nTotal income: $%d\n",
                         numTicketsPurchased, perc , '%', currentIncome, totalIncome);
    }

    public static int buyTicket(Scanner input, String[][]kino, int riadok, int stlpec){
        System.out.println("Enter a row number:");
        int rowNum = input.nextInt();
        System.out.println("Enter a seat number in that row:");
        int colNum = input.nextInt();

        boolean invalid_input =  rowNum>riadok || rowNum<1 || colNum<1 || colNum>stlpec||kino[rowNum][colNum]=="B";
        while (invalid_input){
            if (rowNum>riadok || rowNum<1 || colNum<1 || colNum>stlpec)
                System.out.println("Wrong input!");
            else
                System.out.println("That ticket has already been purchased!");
        
            
            System.out.println("Enter a row number:");
            rowNum = input.nextInt();
            System.out.println("Enter a seat number in that row:");
            colNum = input.nextInt();

            invalid_input = rowNum>riadok || rowNum<1 || colNum<1 || colNum>stlpec||kino[rowNum][colNum]=="B";            
        }
        
        ticketPrice = calcTicketPrice(rowNum, colNum,  riadok,  stlpec);
        System.out.println("Ticket price:$" + ticketPrice);
        kino[rowNum][colNum] = "B";
        return ticketPrice;
    }
    public static void showSeats(String[][]kino){
        System.out.println("Cinema:");
        printArray(kino);
    }
    public static void buildArr(String[][]kino){
        fillArray(kino);
    }

    public static void fillArray(String[][] kino) {
        for (int i = 0; i < riadok+1; i++) {

            for (int j = 0; j < stlpec+1; j++) {

                if (i == 0) {

                    if (j == 0) {
                        kino[i][j] = " ";
                    } else {
                        kino[i][j] = String.valueOf(j);
                    }
                } else {
                    if (j == 0) {
                        kino[i][j] = String.valueOf(i);
                    } else {
                        kino[i][j] = "S";
                    }
                }

            }

        }

    }

    public static int calcTicketPrice(int rowNum, int colNum, int riadok, int stlpec){
        int numSeats = riadok * stlpec;
        int ticketPrice = 0;
        if (numSeats<=60)  
            ticketPrice = 10;
        else{
                int frontHalf, backHalf;
                if (riadok %2 ==0){
                        if ( rowNum > (riadok/2))
                            ticketPrice = 8;
                        else
                            ticketPrice = 10;
                }
                else{
                    if ( rowNum > (int)(riadok/2))
                            ticketPrice = 8;
                        else
                            ticketPrice = 10;
                }
            }  // end of outer else clause

        return ticketPrice;
    } // end of method

    public static void printArray(String[][] kino) {
        for (int i = 0; i < riadok+1; i++) {
            for (int j = 0; j < stlpec+1; j++) {
                System.out.print(kino[i][j] + " ");
                //if(j < kino[i].length - 1) System.out.print(" ");
            }
            System.out.println();
        }
    }


    public static int calculateProfit(int riadok, int stlpec) {
        int numberOfSeats = riadok * stlpec;
        int priceofTicket = 0;
        int profit = 0;

        if (numberOfSeats <= 60) {
            priceofTicket = 10;
            profit = numberOfSeats * priceofTicket;
            return profit;
        } else {
            priceofTicket = 10;
            for (int i = 0; i < riadok / 2; i++) {
                for (int j = 0; j < stlpec; j++) {
                    profit += priceofTicket;
                }
            }
            priceofTicket = 8;
            for (int i = riadok/2; i < riadok; i++) {
                for (int j = 0; j < stlpec; j++) {
                    profit += priceofTicket;
                }
            }
            return profit;
        }
    }

}