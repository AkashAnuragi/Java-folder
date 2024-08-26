/* For a given integer array of size N. You have to find all the occurrences (indices) of a given element (Key) and print them. Use a recursive function to solve this problem.

Sample Input: arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2), key = 2
Sample Output: 1578 
*/

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
