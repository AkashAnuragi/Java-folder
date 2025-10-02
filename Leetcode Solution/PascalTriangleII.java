import java.util.*;
public class PascalTriangleII {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        row.add(1);  // row 0

        for( int i =1; i<=rowIndex;i++) {
            for(int j = i - 1; j>0;j--) {
                row.set(j, row.get(j) + row.get(j-1));
            }
            row.add(1);
        }
        return row;
    }
    public static void main(String[] args) {
        PascalTriangleII pt = new PascalTriangleII();
        System.out.println(pt.getRow(3));
        System.out.println(pt.getRow(0));
        System.out.println(pt.getRow(1));
    }
}