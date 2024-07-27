public class bit_manipulation04 {
    public static int clearIthBit(int n, int i){
        int bitmask = ~(1<<i);
        return n & bitmask;
    }
    public static void main(String[] args) {
        System.out.println(clearIthBit(10, 1 ));
    }
}
