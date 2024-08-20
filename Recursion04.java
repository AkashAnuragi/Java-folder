// Print Sum of natural numbers by using  Recursion.

import java.util.*;

public class Recursion04 {
    public static int CalSum( int n){
        if (n == 1) {
            return 1;
        }
        int snm1 = CalSum(n-1);
        int sm = n + snm1;
        return sm;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter the number: ");
            int n = sc.nextInt();
        
        System.out.println( "The Sum  of  " + n +"  Natural Number  is: " + CalSum(n));
    }
}
