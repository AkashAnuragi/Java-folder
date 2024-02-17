import java.util.*;
public class ifelse{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age =  sc.nextInt();
        if (age<18) {
            System.out.println("you are not is not eligible");
            
        }
        else if (age==18 && age<50) {
            System.out.println("you are  eligible.");
            
        }

        else{
            System.out.println(" You are not eligible.");
        }
    }
}