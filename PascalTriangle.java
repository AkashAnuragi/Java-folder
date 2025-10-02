import java.util.*;
public class PascalTriangle {
    static List<List<Integer>> generate(int num) {
        List<List<Integer>> triangle = new ArrayList<>();
        for(int i = 0;i<num; i++) {
            List<Integer> row = new ArrayList<>();
            for(int j=0;j<=i;j++) {
                if(j==0 || j==i) {
                    row.add(1);
                }else{
                    int value = triangle.get(i-1).get(j-1) + triangle.get(i-1).get(j);
                    row.add(value);
                }
            }
            triangle.add(row);
        }
        return triangle;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        List<List<Integer>> result = generate(num);
        for(List<Integer> n: result){
            System.out.println(n);
        }
    }
}