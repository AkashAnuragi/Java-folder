import java.util.Scanner;

public class bit_manipulation01 {
    public static void OddEven(int n ){
        int bitmask = 1;
        if( (n & bitmask) == 0){
            System.out.println("the number is Even");
        }
        else{
            System.out.println("The number is Odd");
        }
    }
    public static void main(String[] args) {
        OddEven(5);
        OddEven(7);
        OddEven(24);
        OddEven(12);
    }
}
