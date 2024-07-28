public class bit_manipulation05 {
    public static int clearIthBit(int n, int i){
        int bitmask = ~(1<<i);
        return n & bitmask;
    }

    public static int updateIthBit(int n ,int i, int newbit){
        n  = clearIthBit(n, i);
        int bitmask = newbit << i;
        return n | bitmask;
    }
    public static void main(String[] args) {
        System.out.println(updateIthBit(10, 2, 1 ));
    }
}
