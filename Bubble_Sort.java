import java.util.*;
public class Bubble_Sort{

    public static void BubbleSort(int arr[]){
        boolean swap ;
        for(int turn =0 ;turn<arr.length-1; turn++){
            swap = false; // for optimizing code.
            for(int j = 0 ; j<arr.length-1-turn; j++){
                if(arr[j] > arr[j+1]){
                    //Swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            if(swap == true){
                break;
            }
        }
    }

    public static void printArr(int arr[]){
        for(int i = 0 ; i<arr.length ;i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {5,8,3,2,1,4,6,9};
        // int arr[] = {1,2,3,4,5,6,7,8,9}
        BubbleSort(arr);
        printArr(arr);
    }
}

// Time Complexity: O(N2)
// Auxiliary Space: O(1)