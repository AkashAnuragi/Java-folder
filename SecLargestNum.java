import java.util.Arrays;

public class SecLargestNum {
    public static int secLargestNum(int num[]) {
        int n = num.length;
        Arrays.sort(num);
        for(int i = n-2;i>=0;i--) {

            if (num[i] != num[n-1]) {
                return num[i];                
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int num[] = {2,4,6,3,1,7,87,2,121,23};
        System.out.println(secLargestNum(num));
    }
}
