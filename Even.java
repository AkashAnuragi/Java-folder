import java.util.*;

public class EVEN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println("The value is even");
        } else {
            System.out.println("The value is odd");
        }
    }
}