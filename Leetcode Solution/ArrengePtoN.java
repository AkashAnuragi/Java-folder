public class ArrengePtoN {
    public static void arrange(int arr[]) {
        int n = arr.length;
        int temp[] = new int[n];
        int m = 0;

        // Move negative numbers first
        for(int i = 0; i < n; i++) {
            if(arr[i] < 0) {
                temp[m] = arr[i];
                m++;
            }
        }

        // Then move zeros
        for(int i = 0; i < n; i++) {
            if(arr[i] == 0) {
                temp[m] = arr[i];
                m++;
            }
        }

        // Then move positive numbers
        for(int i = 0; i < n; i++) {
            if(arr[i] > 0) {
                temp[m] = arr[i];
                m++;
            }
        }

        // Print the arranged array
        for(int i = 0; i < n; i++) {
            System.out.print(temp[i] + " ");
        } 
    }

    public static void main(String[] args) {
        int arr[] = {-1, -4, -5, 2, 0, 4, -2, 5};
        arrange(arr);
    }
}
