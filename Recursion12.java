import java.util.Scanner;

public class Recursion12 {
    public static void removeDuplicates( String str, int indx, StringBuilder newstring, boolean map[]){
        // Base Case.
        if (indx == str.length()) {
            System.out.println(newstring);
            return;
        }
        // work 
        char currchar = str.charAt(indx);
        if (map[currchar-'a'] == true) {
            // duplicate
            removeDuplicates(str, indx+1, newstring, map);
        }
        else{
            map[currchar-'a'] = true;
            removeDuplicates(str, indx+1, newstring.append(currchar), map);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        removeDuplicates(str, 0,new StringBuilder(""), new boolean[26]);
    }
    
}
