public class Quick_Sort {
    public static void printArr(int arr[]){
        for(int i= 0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }

    public static void quickSort(int arr[], int si, int ei){
        int mid = si + (ei - si )/2;  // You can also write (si + ei)/2

        // Base Case.
            if(si >= ei){
                return;
            }

        // Recursive Case.
        // last element.
        int pdx = partition(arr, si , ei); 
        quickSort(arr, si, pdx -1);
        quickSort(arr, pdx + 1, ei);
    }
    public static int partition( int arr[], int si , int ei){
      int pivot = arr[ei];
       int i = si-1; // to make space elements smaller than pivot.
       for(int j = si ; j<ei; j++){
        if (arr[j]<= pivot) {
            i++;
            // Swap
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
        }
       }
       i++;     
       int temp = pivot;
       arr[ei] = arr[i];
       arr[i] = temp;
       return i ;
    }
    public static void main(String[] args) {
        int arr[] = {12,3, 8, 9,-2, 3, 11, 5, 4};
        quickSort(arr, 0, arr.length-1);
        printArr(arr);
    }
}
