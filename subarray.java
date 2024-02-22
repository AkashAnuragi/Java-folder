public class subarray {
    public static void pair(int number[]) {
        System.out.println("The arrays of sub array are : ");
        int ts =0;
        for(int i=0 ; i<number.length ;i++){
            int start =i ;
            for(int j=i ;j<number.length ;j++){
                int end = j ;
                for(int k = start ;k<= end ;k++){
                System.out.print(number[k]+" "); //subarray
                }
                System.out.println();
                ts++;
            }
            System.out.println();
        }
        System.out.println("Total subarray is : " + ts);
    }
    public static void main(String[] args) {
        int number[] = {2, 4, 6, 8,10};
        pair(number);
    }
}
