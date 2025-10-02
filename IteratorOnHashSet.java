import java.util.*;
class IteratorONHashSet {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("Apple");
        hs.add("Mango");
        hs.add("Banana");
        hs.add("Orange");
        hs.add("Grapes");

        Iterator<String> it = hs.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}