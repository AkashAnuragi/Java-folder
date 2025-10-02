public class JumpGame {
    public boolean jumpGame(int nums[]) {
        int reachable = 0;
        for(int i =0;i<nums.length;i++) {
            if(i>reachable) {
                return false;
            }
            reachable = Math.max(reachable,i + nums[i]);
        }
        return true;
    }

    public static void main(String[] args) {
        JumpGame obj = new JumpGame();
        int nums1[] = {2,3,1,1,4};
        int nums2[] = {3,2,1,0,4};
        System.out.println(obj.jumpGame(nums1));
        System.out.println(obj.jumpGame(nums2));
    }
}
