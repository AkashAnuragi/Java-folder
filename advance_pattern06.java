// 0 0 0 0 0 0 0 0 0 10
// 0 0 0 0 0 0 0 0 9   
// 0 0 0 0 0 0 0 8
// 0 0 0 0 0 0 7
// 0 0 0 0 0 6
// 0 0 0 0 5
// 0 0 0 4
// 0 0 3
// 0 2
// 1
public class advance_pattern06 {
    public static void main(String[] args) {
        int n = 10;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n-i-1;j++) {
                System.out.print("0" +" ");
            }
            System.out.println(n-i);
        }
    }
}
