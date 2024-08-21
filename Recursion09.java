import java.util.Scanner;

public class Recursion09 {
    public static int power(int x, int n ){
        if (n == 0) {
            return 1;
            
        }
        int xnm1= power(x, n-1);
        int xn = x* xnm1;
        return xn;
    }
     
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int x = sc.nextInt();
        System.out.print("Enter the Power: ");
        int n = sc.nextInt();
        System.out.print(power(x, n));
    }
}
