public class Grid_ways {

    public static int gridways(int i, int j, int n, int m){
        // Base Case 
        if (i== n-1 && j==n-1) {  // Condition for last cell.
            return 1 ;
        }
            else if(i == n || j==n){ // Boundary Cross Condition.
                return 0;
            }

            // Work
            int w1 = gridways(i+1, j, n, m) ;
            int w2 = gridways(i, j+1, n, m);
            return w1+w2; 
    }
    public static void main(String[] args) {
        int n = 3 ;
        int m = 3;
         System.out.println(gridways(0, 0, n, m));
    }
}

// Time Complexity = O(2^n+m) This is very worst time complexity 