import java.util.*;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();

        hs.add(1);
        hs.add(3);
        hs.add(4);
        hs.add(2);
        hs.add(1);
        hs.add(2);
        hs.add(4);

        System.out.println(hs);
        System.out.println(hs.size());
        System.out.println(hs.remove(3));
        System.out.println(hs.contains(2));

        System.out.println(hs.contains(3)); // flase
        System.out.println(hs.contains(7)); // false
    }

}
