import java.util.Scanner;

public class Recursion11 {
    public static int  tillingProblem(int n){
        //Base case 

        if (n == 0 || n == 1) {
            return 1;
        }

        // Vertical case 
         int fnm1 = tillingProblem(n-1);

         // Horizontal case 
         int fnm2 = tillingProblem(n-2);
          // Total ways
          int tatal_ways = fnm1 + fnm2;
          return tatal_ways;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n  = sc.nextInt();
        System.out.println(tillingProblem(n));
    }
}
