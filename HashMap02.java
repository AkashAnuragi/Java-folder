import java.util.*;

public class HashMap02 {
    public static void main(String[] args) {
        HashMap<String,Integer> yaar = new HashMap<>();
        
        //Add keys and Values (Country, City)
     yaar.put("Akash", 200);
     yaar.put("Sagar", 543);
     yaar.put("Akhil", 123);
     yaar.put("Kartik", 121);
     yaar.put("Harsh", 100);
        System.out.println (yaar);
       
        // Iteration in HashMap
        Set<String> key = yaar.keySet();
        System.out.println(key);

        for (String k : key) {
            System.out.println("Key is:" + k + "," + "Value is: " + yaar.get(k));        
        }
    }
}
