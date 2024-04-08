import java.util.HashSet;
public class hashset{
    public static void main(String[] args) {
        HashSet<String> Cars = new HashSet<String>();

        Cars.add("Volvo");
        Cars.add("BMW");
        Cars.add("Volvo");
        Cars.add("Mazda");
        Cars.add("Ford");
         // for LOOP 
         for(String i : Cars){
            System.out.println(i);
        }  // Volvo only appear once because every item in a set to be Unique.

        // Check if an item is exist.
        System.out.println("Contained item exist: " +Cars.contains("Ford"));

        //Remove an item.
        System.out.println("Item is removed: " +Cars.remove("Ford"));
        System.out.println(Cars);

        // Size of Hashset
        System.out.println("The Size of HastSet is: " + Cars.size());

       
    }
}