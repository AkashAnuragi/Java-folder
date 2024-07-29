public class bit_manipulation06 {
    public static int clearIthBits(int n, int i){
        int bitmask = (~0) << i;
        return n & bitmask;
    }
    public static void main(String[] args) {
        System.out.println(clearIthBits(15, 2 ));
    }
}
