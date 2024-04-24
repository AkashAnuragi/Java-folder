import java.util.Scanner;

public class TOD_array {
    public static boolean Search(int matrix[][] , int key){
    for(int i= 0; i<matrix.length; i++){
        for(int j= 0; j<matrix[0].length; j++){
            if(matrix[i][j]==key){
                System.out.println("The key value is found at ("+ i + "," +j + ")");
                return true;
            }
        }
    }
    System.out.println("The key value is not Found !!");
        return false;
}
    public static void main(String args[]){
        // int key = new int();
        int matrix[][] = new int[3][3];
        int n = matrix.length ;
        int m = matrix[0].length ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the key value: ");
        int key = sc.nextInt();
        System.out.print("Enter the matrix values: ");
        for(int i= 0; i<n; i++){
            for(int j= 0; j<m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        
        //For Output
        for(int i= 0; i<n; i++){
            for(int j= 0; j<m; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        Search(matrix, key);
    }
}