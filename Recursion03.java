// Print Factorial of any number using Recursion.

import java.util.*;

public class Recursion03 {
    public static int Fact( int n){
        if (n == 0) {
            return 1;
        }
        int fm1 = Fact(n-1);
        int fn = n * Fact(n-1);
        return fn;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter the number: ");
            int n = sc.nextInt();
        
        System.out.println( "The Factorial of " + n +" is: " + Fact(n));
    }
}
