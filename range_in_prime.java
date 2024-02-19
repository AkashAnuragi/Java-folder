import java.util.*;

public class range_in_prime {
    public static boolean Isprime(int n) { //check Prime number
         boolean isprime = true ;
         if (n == 2) {
            return isprime;
         }
         
            for( int i = 2 ; i <= Math.sqrt(n); i++){
                if (n%i == 0) 
                isprime = false ;          
         }
         return isprime ;
    }

    public static void PrimeInRange(int n) {  // Check Range In Prime Number
        for(int i= 2 ; i<=n;i++){
            if (Isprime(i)) {//true
                System.out.print(i+" ");
            }   
        }
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
     PrimeInRange(n); // 2 to n
    }
}
