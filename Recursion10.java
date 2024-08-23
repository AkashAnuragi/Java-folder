import java.util.Scanner;

public class Recursion10 {
    public static int OptimizePower(int x, int n){
        if( n==0){
        return 1;
        }

        int halfpower = OptimizePower(x, n/2);
        int halfpowersq = halfpower * halfpower;

        // n is  odd.
        if (n % 2 != 0) {
            halfpowersq = x * halfpowersq;
        }
        return halfpowersq;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of x: ");
        int x = sc.nextInt();
        System.out.print("Enter the value of y: ");
        int n = sc.nextInt();
        System.out.println(OptimizePower(x,n));
    }
}


