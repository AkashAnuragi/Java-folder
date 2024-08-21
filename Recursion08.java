// WAP to find a Last Occurance of an Elements  in a given Array.

public class Recursion08 {
    public static int LastOccurance(int arr[], int key, int i){
        if (i == arr.length) {
            return -1;
        }
        int Isfound = LastOccurance(arr, key, i+1);

        if (Isfound == -1 && arr[i] == key ) {
            return i ;
        }
        return Isfound;
    }

    public static void main(String[] args) {
        int arr[] = {3,5,8,6,8,7,4,6,7,0};
        System.out.println(LastOccurance(arr, 7, 0));
    }
}
