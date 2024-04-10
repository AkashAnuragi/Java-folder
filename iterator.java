import java.util.ArrayList;
import java.util.Iterator;
public class iterator {
    public static void main(String[] args) {
        //make a collection
        ArrayList<String> Cars = new ArrayList<String>();
        Cars.add("Volvo");
        Cars.add("BMW");
        Cars.add("Ford");
        Cars.add("Mazda");

        //Get the Iterator
        Iterator<String> it = Cars.iterator();

        //Print the First item
        System.out.println(it.next());

        //Looping through the Collection.
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        //Remove an item.
        System.out.println(Cars.remove("Volvo"));
        System.out.println(Cars);
    }
}
