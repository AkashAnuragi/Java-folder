public class Merge_Sort {
    public static void printArr(int arr[]){
        for(int i= 0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }

    public static void MergeSort(int arr[], int si, int ei){
        int mid = si + (ei - si )/2;  // You can also write (si + ei)/2

        // Base Case.
            if(si >= ei){
                return;
            }

        // Recursive Case.
         // For left part.
         MergeSort(arr, si, mid);

         // For Right part. 
         MergeSort(arr, mid+1, ei);
          
         Merge(arr, si, mid, ei);
    }

    public static void Merge( int arr[], int si , int mid ,int ei){
        int temp[] = new int[ei - si + 1];
        int i = si ; // iterator for left part.
        int j = mid + 1 ; // iterator for Right part.
        int k = 0 ;

        while( i <= mid && j <= ei){
            if (arr[i] < arr[j] ) {
                temp[k] = arr[i];
                i++;
            }
            else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // for left 
        while(i <= mid){
            temp[k++] = arr[i++];
        }
        
        // for right part.
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // Copy temp to arr
        for(k=0, i=si; k<temp.length; k++, i++){
            arr[i] = temp[k];
        }
    }

    public static void main(String[] args) {
        int arr[] = {12,3, 8, 9,-2, 3, 11, 5, 4};
        MergeSort(arr, 0, arr.length-1);
        printArr(arr);

    }
}