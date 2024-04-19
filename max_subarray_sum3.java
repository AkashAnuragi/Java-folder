import java.util.*;
//kadanes sum
public class max_subarray_sum3 {
    public static void maxSubarraySum3(int number[]) {
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
    public static void kadanes(int numbers[]){
        int ms = Integer.MIN_VALUE;
        int cs =0;
        for(int i =0 ; i<numbers.length ; i++){
            cs = cs + numbers[i];
            if(cs<0){
                cs=0;
            }
            ms = Math.max(cs,ms);
        }
        System.out.println("Our maximum subarray sum is :" + ms);
    }
    public static void main(String[] args) {
        int numbers[] = {-2,-3,4,-1,-2,1,5,-3};
        kadanes(numbers);
    }
}
