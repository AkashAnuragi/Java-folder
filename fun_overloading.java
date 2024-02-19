import java.util.*;

public class fun_overloading {
    public static int sum(int a , int b) {
        int sum = a + b;
        return sum;
    }
    public static int sum(int a , int b ,int c) {
        int sum = a + b +c;
        return sum ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int sum1 = sum(a, b);
        int sum2 = sum(a, b, c);
        System.out.println("sum is : " +sum1);
        System.out.println("sum is : " +sum2);
        
    }
}