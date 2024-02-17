public class reverse_number {
    public static void main(String[] args) {
        int n = 12122002 ;
        int m = 12122002 ;
        while (n>0) {
            int lastdigit = n % 10 ; 
            System.out.print( lastdigit);
             n = n / 10 ;
        } 
        System.out.println("\n");

        // Another method
        int rev = 0 ;
        while (m>0) {
            int lastdigit = m % 10 ; 
            rev = ( rev * 10) + lastdigit ;
            m = m / 10 ;
        }
        System.out.println("The reverse number is : " +rev);
    }
}