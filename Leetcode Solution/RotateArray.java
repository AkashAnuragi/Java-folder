public class RotateArray {
    public void rotateArray(int nums[], int k) {
        int n = nums.length;
        int temp[] = new int[n];

        for (int i = 0; i < n; i++) {
            temp[(i + k) % n] = nums[i];
        }
        for (int i = 0; i < n; i++) {
            nums[i] = temp[i];
        }
    }

    public static void main(String[] args) {
        RotateArray obj = new RotateArray();   // create object
        int nums[] = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        obj.rotateArray(nums, k);            // call method

        // Print rotated array
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
