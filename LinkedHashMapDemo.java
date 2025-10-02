import java.util.*;
public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> lh = new LinkedHashMap<>();
        lh.put("India",200);
        lh.put("USA",100);
        lh.put("Nepal",500);
        lh.put("China",300);

        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("India",200);
        hm.put("USA",100);
        hm.put("Nepal",500);
        hm.put("China",300);

        TreeMap<String, Integer> th = new TreeMap<>();
        th.put("India", 200);
        th.put("USA", 100);
        th.put("Nepal", 500);
        th.put("China", 300);
        th.put("Africa", 300);

        System.out.println("HashMap: "+hm);
        System.out.println("LinkedHashMap: " + lh);
        System.out.println("TreeMap: " + th);

    }
    
}
