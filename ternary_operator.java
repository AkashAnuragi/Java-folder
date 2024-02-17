import java.util.*;

public class ternary_operator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String type = (num%2==0) ? "Even" : "Odd";
        System.out.println("The type of number is : " +type);
    }
}
