import java.util.ArrayList;
import java.util.Collections;

public class Reverse_ArrayList {
    public static void main(String[] args) {
        ArrayList<String> Subject = new ArrayList<String>();
        Subject.add("Maths");
        Subject.add("Chemisty");
        Subject.add("Physics");
        Subject.add("English");
        Subject.add("Hindi");
        System.out.println(Subject);
        Collections.reverse(Subject);
        System.out.println("Reverse ArrayList: " + Subject);

        // OR -- O(n)
        int n = Subject.size();
        System.out.println(" By For loop");
        for(int i = n-1 ;i>=0 ;i--){
            System.out.print(Subject.get(i) + " ");
        }
        System.out.println();
    }
}
