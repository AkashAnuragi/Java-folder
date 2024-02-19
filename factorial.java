import java.util.Scanner;

public class factorial {
    public static int fact(int n) {
        int product = 1 ;
        for(int i = 1 ;i<=n ;i++){
            product =product * i ;
        }
        return product ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();
       int product = fact(n);
        System.out.println("Factorial is : " +product);
        
    }
}