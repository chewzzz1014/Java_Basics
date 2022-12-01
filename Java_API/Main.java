import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rows = n, columns = n, middle = (n+1)/2 - 1;
        String[][] patterns = new String [middle][n];

        int n1=0, n2=middle, n3=n-1;
        // part before middle (0 to middle-1)
        for (int i=0; i<middle; i++){
            for (int j=0; j<n; j++){
                if (j==n1 || j==n2 || j==n3)
                    patterns[i][j] = "*";
                else
                    patterns[i][j] = ".";
            }
            n1++;
            n3--;
        }
        
        for(int i=0; i<middle; i++){
            for(int j=0; j<n; j++){
                if (j==n-1)
                    System.out.println(patterns[i][j]);
                else
                    System.out.print(patterns[i][j]+" ");
            }
        }

        for (int i = 0; i<n; i++){
            if (i==n-1)
                System.out.println("*");
            else
                System.out.print("* ");
        }

        
        
        for(int i=middle-1; i>=0; i--){
            for(int j=0; j<n; j++){
                if (j==n-1)
                    System.out.println(patterns[i][j]);
                else
                    System.out.print(patterns[i][j]+" ");
            }
        }
           


        
    }
}
