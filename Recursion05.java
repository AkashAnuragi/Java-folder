// Find Nth Fibonacci Number.

import java.util.*;

public class Recursion05 {
    public static int Fib( int n){
        if (n == 0 || n == 1) {
            return n;
        }
        int fnm1 = Fib(n-1);
        int fnm2 = Fib(n-2);
        int fn = fnm1 + fnm2;
        return fn;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter the number: ");
            int n = sc.nextInt();
        
        System.out.println(  Fib(n));
    }
}
