import java.util.ArrayList;
// Optimized method.
public class Opt_Store_water {
    public static int storeWater(ArrayList<Integer> height){
    int maxWater = 0;
    int lp = 0;
    int rp = height.size()-1;
     // Calculate area of Water
     while (lp < rp) {
        int ht = Math.min(height.get(lp), height.get(rp));
        int width = rp -lp;
        int currWater = ht * width;
         maxWater = Math.max(maxWater, currWater);

        // update
        if (height.get(lp) < height.get(rp)) {
            lp++;
        }else{
            rp++;
        }
     }
     return maxWater;
}
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(9);
        System.out.println(" The Maximum Stored Water is : " + storeWater(height ));
    }
}

// Time Complexity - O(N)
