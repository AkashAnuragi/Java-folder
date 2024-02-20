/*
1
01
101
0101
           */
import java.util.Scanner;

public class advance_star_pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value : ");
        int num = sc.nextInt();
        for( int row = 1 ; row <= num ; row++){
            for(int col = 1 ;col<=row ;col++){
                if((row+col)%2 ==0){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}
