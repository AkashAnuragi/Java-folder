import java.util.HashMap;
public class hashmap {
    public static void main(String[] args) {
        HashMap<String,String> Capitalcities = new HashMap<String,String>();
        
        //Add keys and Values (Country, City)
        Capitalcities.put("England", "London");
        Capitalcities.put("Germany", "Berlin");
        Capitalcities.put("Norway", "Oslo");
        Capitalcities.put("India", "Delhi");
        Capitalcities.put("Pakistan", "Islamabad");
        System.out.println(Capitalcities);
        // Access an items
        System.out.println(Capitalcities.get("England"));

        // Remove an item
        System.out.println("Remove item is: "  +Capitalcities.remove("Pakistan"));
        System.out.println(Capitalcities);
        // For clear all the item use Clear() syntax;
        // System.out.println(Capitalcities.clear());

        // hashmap Size
        System.out.println("the Size of HashMap is: " + Capitalcities.size());
    }
}
