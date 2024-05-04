import java.util.Scanner;

public class substring_function {
    public static String subtring(String str , int si, int ei){
        String substr = "";
        for(int i = si ; i<ei ; i++){
            substr += str.charAt(i);
        }
        return substr ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(subtring(str, 0, 5));

        // without using loop
        System.out.println(str.substring(0, 7));
    }
}