 import java.util.*;
public class HIndex {
    public int hIndex(int citations[]) {

        // sorting the array in desc order
        Arrays.sort(citations);
        int n = citations.length;

        //check the h-index by iterating from the last paper
        for(int i = 0; i<n; i++) {
            if(citations[i] >= n-i) {
                return n-i;  // this is the h-index
            }
        }
        return 0;  // no valid h- index
    }

    public static void main(String[] args) {
        HIndex hIndexCalculator = new HIndex();
        int citations1[] = {3,0,6,1,5};
        System.out.println("Output of citations1: " + hIndexCalculator.hIndex(citations1));
        int citations2[] = {1,3,1};
        System.out.println("Output of citations2: " + hIndexCalculator.hIndex(citations2));

    }
}
