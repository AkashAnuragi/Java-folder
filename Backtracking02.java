import java.util.Scanner;

public class Backtracking02{
    public static void subSets(String str, String ans , int i){
        // Base Case
        if (i == str.length()) {
            if (str.length() == 0) {
                System.out.println("NUll");
            }
           
        else{
            System.out.println(ans);
        }
        return;   
    }

        // Recursive Case.
        // Yes Choice
        subSets(str, ans+str.charAt(i), i+1);
        // No choice
        subSets(str, ans, i+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The String: ");
        String str = sc.nextLine();
        subSets(str, "", 0);
    }
}