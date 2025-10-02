import java.util.*;
class Move_Zeros {
    public static void moveZeros(int arr[]) {

        int nonZero = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] != 0){
                arr[nonZero] = arr[i];
                nonZero++;
            }
        }
        for(int i = nonZero; i<arr.length; i++) {
            arr[i] = 0;
        }
    }
    
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,0,0,0,5,6,7};
        moveZeros(arr);
        System.out.println(Arrays.toString(arr));
    }
}