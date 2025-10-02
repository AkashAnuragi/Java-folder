import java.util.*;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<String> fruits = new TreeSet<>();

        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Orange");

        // Iteration using enhanced for-loop
        System.out.println("Fruits in the TreeSet:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Output will be sorted:
        // Apple
        // Banana
        // Mango
        // Orange
    }
}
