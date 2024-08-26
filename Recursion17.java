// WAP to find a length of String using Recursion.

public class Recursion17 {
    public static int length(String str){
        // Base Case 
        if (str.length() == 0) {
            return 0 ;
        }

        // Recursive call
        return length(str.substring(1)) + 1;
    }
    public static void main(String[] args) {
        String str = "abcde";
        System.out.println(length(str));
    }
}
