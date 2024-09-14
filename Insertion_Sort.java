public class Insertion_Sort {

    public static void insertionSort(int arr[]){
        for(int i = 1; i<arr.length; i++){
            int curr = arr[i];
            int prev = i-1; 

            while( prev>=0 && arr[prev] > curr){
                arr[prev+1]  = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }
    }

    public static void printArr(int arr[]){
        for(int i = 0 ; i<arr.length ;i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }
        public static void main(String[] args) {
            int arr[] = {5, 4, 1, 3, 2};
            insertionSort(arr);
            printArr(arr);
        }
}

// Time Complexity: O(N2
// Auxiliary Space: O(1) 