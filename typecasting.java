public class typecasting {
    public static void main(String[] args) {
        // This is widening typecasting : convert smaller data type to larger data type.
        int a = 5;
        float b = a ;
        System.out.println("before conversion : "+ a);
        System.out.println("after conversion : " + b);


        // this is Narrowing type casting : convert larger data type to smaller data type .
        float x = 12.52f; 
        int y = (int)x ;
        System.out.println("before conversion : "+x);
        System.out.println("after conversion : "+y);
    }
}
