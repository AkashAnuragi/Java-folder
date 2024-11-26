import java.util.*;
public class Merge2Arrays{
public static void Merge2Arr(int arr1[],int arr2[], int arr3[]) {

    int n1 = arr1.length;
    int n2 = arr2.length;
    for(int i = 0; i<n1;i++){
        arr3[i] = arr1[i];
    }

    for(int j = 0; j<n2;j++){
        arr3[n1 + j] = arr2[j];
    }
    Arrays.sort(arr3);
}

    

    public static void main(String[] args) {
        int arr1[] = {1,2,3,4};
        int arr2[] = {5,6,7,8,9};
        int arr3[] = new int[arr1.length + arr2.length];
        Merge2Arr(arr1,arr2,arr3);

        for(int i= 0; i<arr3.length;i++){
            System.out.print(arr3[i] + " ");
        }
    }
}
