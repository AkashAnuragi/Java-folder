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
        String str = "abcd";
        System.out.println(length(str));
    }
}
