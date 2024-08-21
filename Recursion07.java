// WAP to find a First Occurance in a given Array.

public class Recursion07 {
    public static int FirstOccurance(int arr[], int key, int i){
        if (i == arr.length) {
            return -1;
        }

        if (arr[i] == key ) {
            return i ;
        }
        return FirstOccurance(arr, key, i+1);
    }

    public static void main(String[] args) {
        int arr[] = {3,5,8,6,8,7,4,6,7,0};
        System.out.println(FirstOccurance(arr, 7, 0));
    }
}
