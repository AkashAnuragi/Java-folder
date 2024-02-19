import java.util.Scanner;

public class function {
    //function without parameters.
    public static void printhelloworld() {
        System.out.println("Hello world");
    }
    // function with paramerters.
    public static int calculatesum(int a , int b ) { //parameter or formal parameter
        int sum = a + b;
        return sum;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a : ");
        int a = sc.nextInt();
        System.out.println("Enter the value of b : ");
        int b = sc.nextInt();
        int sum = calculatesum(a, b); // Argument or actual parameter
        System.out.println("Sum is : " +sum);
        printhelloworld();
    }
    
}
