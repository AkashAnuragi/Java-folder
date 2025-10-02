import java.util.Arrays;
public class PlusOne{
    static int[] onePlus(int num[]) {
        int n = num.length;
        for(int i = n-1; i>=0;i--) {
            if(num[i] < 9){
                num[i]++;
                return num;
            }
            num[i] = 0;
        }
        int result[] = new int[n+1];
        result[0] = 1;
        return result;

    }
    public static void main(String[] args) {
        int num1[] = {1,2,4,5};
        int num2[] = {1,2,4,5,9};
        System.out.println(Arrays.toString(onePlus(num1)));
        System.out.println(Arrays.toString(onePlus(num2)));
    }
}