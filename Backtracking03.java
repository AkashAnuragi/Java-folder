import java.util.Scanner;

public class Backtracking03 {

    public static void findPermutaion(String str, String ans){
    // Base Case
    if(str.length() == 0){
        System.out.println(ans);
        return;
    }

    // Recursive Case
    for( int i = 0; i<str.length();i++){
        char curr = str.charAt(i);
        String NewStr = str.substring(0,i) + str.substring(i+1);
        findPermutaion(NewStr, ans+curr);
    }
}

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The String: ");
        String str = sc.nextLine();
        findPermutaion(str, "");
    }
}
