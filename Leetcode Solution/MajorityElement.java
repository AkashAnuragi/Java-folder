import java.util.HashMap;
import java.util.Map;

// Using Hash Map
public class MajorityElement {
    public int majorityElement(int nums[]) {
        Map<Integer, Integer> countmap = new HashMap<>();
        int majority = nums.length / 2;
        for (int num : nums) {
            countmap.put(num, countmap.getOrDefault(num, 0) + 1);
            if (countmap.get(num) > majority) {
                return num;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int nums[] = {2, 2, 1, 1, 1, 2, 2};
        MajorityElement obj = new MajorityElement();
        int result = obj.majorityElement(nums);
        System.out.println("Majority Element is: " + result);
    }
}
