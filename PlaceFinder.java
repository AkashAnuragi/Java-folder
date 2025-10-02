import java.util.Scanner;

public class PlaceFinder {

    public static int[] findPlace(char[][] grid, char target) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == target) {
                    return new int[]{i, j};  
                }
            }
        }
        return null;  
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int columns = scanner.nextInt();
        scanner.nextLine();  

        char[][] grid = new char[rows][columns];
        System.out.println("Enter the grid elements row by row:");
        for (int i = 0; i < rows; i++) {
            String row = scanner.nextLine();
            for (int j = 0; j < columns; j++) {
                grid[i][j] = row.charAt(j);
            }
        }

        System.out.print("Enter the character to find: ");
        char target = scanner.next().charAt(0);

        int[] position = findPlace(grid, target);

        if (position != null) {
            System.out.println("Character '" + target + "' found at: (" + position[0] + ", " + position[1] + ")");
        } else {
            System.out.println("Character '" + target + "' not found in the grid.");
        }
    }
}