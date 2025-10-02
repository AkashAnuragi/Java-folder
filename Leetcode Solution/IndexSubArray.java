class IndexSubArray{
    public static void findSubArray(int arr[], int target){
        int start = 0 , curr= 0;
        for(int i = 0;i<arr.length;i++){
            curr+=arr[i];

            while(curr > target && start <= i){
                curr -= arr[start++];
            }
                if(curr == target){
                    System.out.println("Subarray found from index " + start + " to " + i);
                    return;
                }
            }
            System.out.println("No Subarray with given Sum is found.");
        }
    public static void main(String[] args) {
        int arr[] = {1,2,3,7,5};
        int target = 12;
        findSubArray(arr, target);

    }
}