import java.util.*;

public class Swap_ArrayList {

    public static void Swap(ArrayList<Integer> Num , int indx1, int indx2){
        int temp = Num.get(indx1);
        Num.set(indx1, Num.get(indx2));
        Num.set(indx2, temp);
    }

    public static void main(String[] args) {
        ArrayList<Integer> Num = new ArrayList<>();
        Num.add(1);
        Num.add(7);
        Num.add(5);
        Num.add(8);
        Num.add(9);
        Num.add(2);
        int indx1 = 1 , indx2 = 2;
        System.out.println(Num);
        Swap(Num, indx1, indx2);
        System.out.println(Num);
        Collections.sort(Num); // Ascending Order
        System.out.println("Sorted: " + Num);
        Collections.sort(Num, Collections.reverseOrder()); // Descending Order
        System.out.println("Sorted: " + Num);
    }
}
