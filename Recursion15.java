public class Recursion15 {
    public static void FindAllOccurance(int arr[], int key, int i){
        // Base Case
        if (i == arr.length) {
            return;
        }

        // Recursive Case.
        if (arr[i] == key ) {
            System.out.print( i + " ");
        }
        FindAllOccurance(arr, key, i+1);
    }
    public static void main(String[] args) {
        int arr[] = {3,2,4,5,6,2,7,2,2};
        int key = 2;
        FindAllOccurance(arr, key, 0);
    }
}
