import java.util.*;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a : ");
        int a = sc.nextInt();
        System.out.println("enter the value of b : ");
        int b = sc.nextInt();
        System.out.println("enter the operator : ");
        char operator = sc.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println("The sum of a & b is : " + (a+b));
                break;
            case '-':
                System.out.println("The subtraction of a & b is : " + (a-b));
                break;
            case '*':
                System.out.println("The multipication of a & b is : " + (a*b));
                break;
            case '/':
                System.out.println("The division of a & b is : " + (a/b));
                break;
            case '%':
                System.out.println("The modulos of a & b is : " + (a%b));
                break;
            
        
            default:
            System.out.println("Wrong Operator ");
                break;
        }
    }
}
