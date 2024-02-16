import java.util.*;
public class avg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a , b , c ;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        float  avg = (a + b + c)/3;
        System.out.println("The sum of three numbers is : " + avg);
    }
}
