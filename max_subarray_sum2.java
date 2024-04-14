import java.util.*;
//prefix sum
public class max_subarray_sum2 {
    public static void maxSubarraySum2(int number[]) {
        System.out.println("The arrays of sub array are : ");
       int currsum = 0;
       int maxsum = Integer.MIN_VALUE ;
       int prefix[] = new int[number.length];
       prefix[0] = number[0];
       //Calculate the perfix array
       for(int i = 1 ;i< prefix.length ;i++){
        prefix[i] = prefix[i-1] + number[i]; 
        }

        for(int i=0 ; i<number.length ;i++){
            int start =i ;
            for(int j=i ;j<number.length ;j++){
                int end = j ;
                currsum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
              
                // System.out.println(currsum);
                if (maxsum < currsum) {
                    maxsum = currsum ;
                }
            }
        }
        System.out.println("max sum  is : " + maxsum);
    }
    public static void main(String[] args) {
        int number[] = {1,-2, 6, -1,3};
        maxSubarraySum2(number);
    }
}
