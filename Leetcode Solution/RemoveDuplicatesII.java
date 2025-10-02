public class RemoveDuplicatesII {
    public int removeDuplicates(int nums[]) {
        int k = 0;
        for(int i =0; i<nums.length;i++) {
            if(k<2 || nums[i] != nums[k-2]) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        int nums[] = {1,1,1,1,2,2,3};
        RemoveDuplicatesII obj = new RemoveDuplicatesII();
        int k = obj.removeDuplicates(nums);

        System.out.println("New length: " + k);
        System.out.print("Modified array: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }   
}
