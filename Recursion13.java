public class Recursion13 {
    public static int FriendsPairing( int n ){
        //Base Case. 
        if (n==1 || n==2) {
            return n;
        }
       // Recursive case 

        // for single 
        int fnm1 = FriendsPairing(n-1);
        
        // for pair. 
        int fnm2 = (n-1) * FriendsPairing(n-2);
        // total ways.
        int total_ways = fnm1 + fnm2;
        return total_ways;

        // return FriendsPairing(n-1) + (n-1)* FriendsPairing(n-2);
    }
    public static void main(String[] args) {
        System.out.println(FriendsPairing(5));
    }
}
