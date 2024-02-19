import java.util.*;

public class bin_coff {
    public static int fact(int n) {
        int product = 1 ;
        for(int i = 1 ;i<=n ;i++){
            product =product * i ;
        }
        return product ;
    }
    public static int bincoff(int n , int r) {
        int fact_n = fact(n);
        int fact_r = fact(r);
        int fact_nmr = fact(n-r);

        int bin_coeff = fact_n/(fact_r*fact_nmr);
        return bin_coeff;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();
        System.out.println("Enter the value of r : ");
        int r = sc.nextInt();
       int binomial = bincoff(n,r);
        System.out.println("binomial Coefficient is : " + binomial);
        
        
    }
}