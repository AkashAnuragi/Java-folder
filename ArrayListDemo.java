import java.util.ArrayList;
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> Boys = new ArrayList<String>();
        Boys.add("Akash");
        Boys.add("Harsh");
        Boys.add("Sagar");
        Boys.add("Kartik");
        System.out.println(Boys); 

        // Add Operation - O(1)
        Boys.add(0,"Akhil");
        System.out.println("After adding: " + Boys);

        // Get Operation - O(1)
        String element = Boys.get(2);
        System.out.println("get Element is: " + element);

        // Remove Operation- O(n)
        Boys.remove(2);
        System.out.println("After Remove: " + Boys);

        // Set Operation- O(n)
        Boys.set(3, "Sandeep");
        System.out.println("After set Operation: " + Boys);

        // Contain Operation - O(n)
        System.out.println(Boys.contains("Akash"));
        System.out.println(Boys.contains("Kartik"));

        //Size
        System.out.println(Boys.size());

        for(int i =0 ; i<Boys.size(); i++){
            System.out.print(Boys.get(i) + " ");
        }
        System.out.println();
    }
}
