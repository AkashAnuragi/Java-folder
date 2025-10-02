import java.util.*;
public class Union_Intersaction {
    public static void main(String[] args) {
        int arr1[] = {1,3,9};
        int arr2[] = {6,3,9,2,9,4};
        HashSet<Integer> set = new HashSet<>();
         for(int i = 0; i<arr1.length;i++){
            set.add(arr1[i]);    
    }

    for(int i = 0; i<arr2.length;i++){
        set.add(arr2[i]);
    }
    System.out.println("The Union of two arrays is: " + set );
    System.out.println("The size of the union is: " + set.size());
    // Intersection of two arrays
    set.clear(); 
    // Clear the set to reuse it for intersection
    for(int i = 0; i<arr1.length;i++){
        set.add(arr1[i]);    
    }
    int count = 0;
    System.out.print("The Intersection of two arrays is: ");
    for(int i = 0; i<arr2.length;i++){
        if(set.contains(arr2[i])){
           count++;
           System.out.print(arr2[i] + "  ");
           set.remove(arr2[i]);
        }                      
    }
    System.out.println();
    System.out.println("The size of the intersection is: " + count);
}
}
