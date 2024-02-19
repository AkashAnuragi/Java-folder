import java.util.Scanner;

public class dec_to_bin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mul = 1 ;
        int ans = 0 ;
        while (n>0) {
            int rem = n%2;
            n /= 2;
            ans += rem * mul ;
            mul *= 10 ;
        }
         System.out.println(ans);
    }
}
