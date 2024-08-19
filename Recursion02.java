// Print number in Increasing Order using Recursion.

public class Recursion02 {
    public static void printInc( int n){
        if (n == 10) {
            System.out.print(n);
            return;
        }
        System.out.print(n + " ");
        printInc(n + 1);
    }
// Another method.
    public static void Inc( int n){
        if (n == 1) {
            System.out.print( "\n" + n + " ");
            return;
        }
        Inc(n-1);
        System.out.print(n + " ");
    }
    

    public static void main(String[] args) {
        int n = 1;
        int m = 10;
        printInc(n);
        Inc(m);
    }
}
