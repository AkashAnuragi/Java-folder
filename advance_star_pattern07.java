/* 
*****
*   *
*   *
*****     
            */
            import java.util.*;

            public class advance_star_pattern07 {
                public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
            
                    // Taking dimensions from user
                    System.out.print("Enter number : ");
                    int n = sc.nextInt();
                    int i;
                    int j;
                    int m = 4;
            
            
                    // Declare 2D array
                    int[][] arr = new int[n][n];
                    for ( i = 0; i < n; i++) {
                        
                        for ( j = 0; j < n; j++) {
                            arr[i][j] = m;
                            if(i==1 || j==1 ||i==n||j==n){
                            System.out.print(m);
                            }
                        }
                        m--;
                        System.out.println();
                    }
            
                    
                }
            }