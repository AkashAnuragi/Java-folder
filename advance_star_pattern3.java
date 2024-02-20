/* 
*****
*   *
*   *
*****     
            */
import java.util.*;

public class advance_star_pattern3 {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Value of Row :");
        int num1 = sc.nextInt();
        System.out.println("Enter the value of Column : ");
        int num2 = sc.nextInt();
        for(int row = 1 ; row <= num1 ;row++){
            for( int col=1 ; col<=num2;col++){
                if (col == 1 || col==num2 || row == 1 || row == num1  ) {
                    System.out.print("*"); 
                }
                else  {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}