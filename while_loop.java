import java.util.*;
// sum of first n natural number.
public class while_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0 ;
        int n = sc.nextInt();
        int i = 1;
        while( i <= n){
            sum = sum + i;
            i++;
        }
        System.out.println(sum);
    }
}
