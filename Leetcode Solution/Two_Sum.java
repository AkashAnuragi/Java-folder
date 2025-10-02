import java.util.*;

public class Two_Sum {
    public static int[] twoSum(int num[], int target){
        for(int i = 0; i<num.length; i++){
            for(int j = i+1;j<num.length; j++){
                if (num[i] + num[j] == target) {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1}; // Target does not Exist.
    }

    public static void main(String[] args) {
        Two_Sum sum = new Two_Sum();
        int num[] = {9, 7, 2, 15};
        int target = 9;
        int result[] = sum.twoSum(num, target);
        System.out.println(Arrays.toString(result));
    }
}
