import java.util.*;

public class bin_to_dec { 
    public static void binToDec(int binNum) {
         int myNum = binNum;
        int pow = 0;
        int decNum = 0;
        while (binNum > 0 ) {
            int lastdigit = binNum % 10 ;
            decNum = decNum + (lastdigit * (int)Math.pow(2 ,pow));
            pow ++;
            binNum /= 10;
        }
        System.out.println("Decimal of " + myNum + "= " + decNum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value : ");
        int num = sc.nextInt();
        binToDec(num);

       
    }
}
