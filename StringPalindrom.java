import java.util.Scanner;

public class StringPalindrom {
    public static boolean Palindrom(String str){
        
        for(int i = 0 ;i< str.length()/2 ;i++){
            int n = str.length();
            if (str.charAt(i) != str.charAt(n-1-i)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = sc.nextLine();
        System.out.println(  Palindrom(str) );
    }
    
}
