import java.util.ArrayList;
import java.util.Collections;

public class Max_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> Num = new ArrayList<>();
        Num.add(1);
        Num.add(7);
        Num.add(5);
        Num.add(8);
        Num.add(9);
        Num.add(2);
        System.out.println(Num);
        
        // System.out.println("Max number: " + Collections.max(Num));

        // Or --O(n)
        int Max = Integer.MIN_VALUE;
        for(int i =0; i< Num.size(); i++){
            // if (Max < Num.get(i)) {
            //     Max = Num.get(i);
            // }
            Max = Math.max(Max, Num.get(i));
        }
        System.out.println("maximum number : " + Max);
    }
}
