public class pair_in_array {
    public static void pair(int number[]) {
        System.out.println("The pair of array : ");
        for(int i=0 ; i<number.length ;i++){
            for(int j=i+1 ;j<number.length ;j++){
                System.out.print("("+number[i]+","+number[j]+ ")" +" ");
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        int number[] = {2, 4, 6, 8,10};
        pair(number);
    }
}
