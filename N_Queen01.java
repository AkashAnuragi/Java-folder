import java.util.Scanner;
// N-Queen print only one Solution.
public class N_Queen01 {
    public static boolean isSafe(char board[][], int row, int col){
        // Verticle up
        for(int i = row-1 ;i>=0 ;i--){
            if(board[i][col] == 'Q') {
                return false;
            }
        }
        // Diagonal left up
        for(int i = row-1, j = col-1 ;i>=0 && j>=0 ;i--, j--){
            if(board[i][j] == 'Q') {
                return false;
            }
        }
        // Diagonal right up
        for(int i = row-1 ,j=col+1 ;i>=0 && j<board.length ;i--,j++){
            if(board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    public static boolean nQueen(char board[][], int row ){
        // Base Case
        if (row == board.length) {
            count++;
            return true;
        }

        // Column Loop
        for(int j = 0; j<board.length; j++){
            if (isSafe(board,row, j)) {
                board[row][j] = 'Q';
            if(nQueen(board, row+1)){
                return true;
            } 

            board[row][j] = 'X';  // Backtracking
            }
        }
        return false;
    }
    public static void printBoard(char board[][]) {
        System.out.println("------- Chase Board --------");
        for( int i =0 ; i<board.length; i++){
            for(int j = 0; j<board.length ; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int count = 0;
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the value of n: ");
       int n = sc.nextInt();
        char board[][] = new char[n][n];
        // initialize
        for( int i =0 ; i<n; i++){
            for(int j = 0; j<n; j++){
                board[i][j] = 'X';
            }
        }
       if(nQueen(board,0)){
        System.out.println("Solution is possible.");
        printBoard(board);
       }
       else{
        System.out.println("Solution is not possible.");
       }
    }
}