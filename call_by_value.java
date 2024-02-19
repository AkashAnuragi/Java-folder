import java.util.*;

public class call_by_value {
    public static void swap(int a , int b ) {
        int temp = a ;
         a = b;
         b= temp ;
         System.out.println("After swap :" +a );
         System.out.println("After swap :" +b );
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a : ");
        int a = sc.nextInt();
        System.out.println("Enter the value of b : ");
        int b = sc.nextInt(); 
        System.out.println("before swap : " +a);
        System.out.println("before swap : " +b);
        swap(a, b);
    }
    
}
