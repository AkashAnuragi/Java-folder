public class max_subarray_sum1 {
    public static void maxSubarraySum1(int number[]) {
        System.out.println("The arrays of sub array are : ");
       int currsum = 0;
       int maxsum = Integer.MIN_VALUE ;

        for(int i=0 ; i<number.length ;i++){
            int start =i ;
            for(int j=i ;j<number.length ;j++){
                int end = j ;
                currsum =0;
                for(int k = start ;k<= end ;k++){
                currsum +=number[k]; //subarray sum
                }
                System.out.println(currsum);
                if (maxsum < currsum) {
                    maxsum = currsum ;
                }
            }
        }
        System.out.println("max sum  is : " + maxsum);
    }
    public static void main(String[] args) {
        int number[] = {2, 4, 6, 8,10};
        maxSubarraySum1(number);
    }
}
