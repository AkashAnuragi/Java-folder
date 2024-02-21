import java.util.*;
public class largest_number {
    public static int getlargest(int number[]) {
        int largest = Integer.MIN_VALUE; // for -infinity
        int smallest = Integer.MAX_VALUE; // for +infinity
        for(int i=0; i<number.length;i++){
            if (largest < number[i]) {
                largest = number[i];
            }
            if (smallest > number[i]) {
                smallest = number[i];
            }
        }
        System.out.println("The smallest number is : " +smallest);
        return largest;
    }
    public static void main(String[] args) {
        int number[] = {2, 4, 5, 12, 8};
        int largest = getlargest(number);
        System.out.println("the largest number : " +largest);
    }
    
}
