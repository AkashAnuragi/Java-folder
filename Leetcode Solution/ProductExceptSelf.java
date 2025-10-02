public class ProductExceptSelf {
    public static int[] productSelf(int nums[]) {
        int n = nums.length;
        int ans[] = new int[n];
        ans[0] = 1;
        for(int i =1; i<n; i++) {
            ans[i] = ans[i -1] * nums[i-1];
        }

        int right = 1; 
        for(int i = n-1;i>=0;i--) {
            ans[i] = ans[i]*right;
            right *= nums[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,4};
        int res[] = productSelf(nums);
        for(int num:res)
        System.out.print(num + " ");
    }
    
}
