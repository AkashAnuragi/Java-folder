import java.util.Scanner;

class Binary_Search{
    public int binarySearch(int nums[], int target){
        int start = 0;
        int end = nums.length -1;
        
        while (start <= end) {
            int mid = start + (end - start)/2;  // To Find the middle value

            // Case 1 
            if (nums[mid] == target) {
                return mid;
            }
            //  Case 2
            else if(nums[mid] < target) // When target is greater than mid
            {
                start = mid + 1 ;
            }
            // Case 3
            else{
                end = mid - 1; // When target is less than middle value.
            }
            
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Binary_Search obj = new Binary_Search();
        int nums[] = {-1,0,3,5,9,12};
        System.out.print("Enter the value of target: ");
        int target = sc.nextInt();
        int result = obj.binarySearch(nums, target);
        if(result == -1){
            System.out.println(result);
        } else{
            System.out.println(result);
        }
    }
}