import java.util.*; 

public class binary_search {
    public static int BinarySearch(int number[], int key) {
        int start = 0;
        int end = number.length -1 ;
        while (start<=end) {
            int mid = (start + end)/2;
            if (number[mid] == key ) {
                return mid ;
            }
            if (number[mid]< key ) {
                start = mid +1; 
            }
            else{
                end =mid - 1 ;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int number[] = {2, 4, 5, 10, 45, 67, 90};
        
        int key = 2;
        System.out.println("The index of key is : " + BinarySearch(number, key));
    }
}
