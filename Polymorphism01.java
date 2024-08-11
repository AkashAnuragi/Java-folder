/* There are two types of Polymorphism
   1. Compile time polymorphism(static)
   method overloading
   2. Run time polymorphism(Dyamic)
   method overridding
 */

 // In this program we learn about a method overloading. 

public class Polymorphism01 {
    public static void main(String[] args) {
        Calculate cal = new Calculate();
        System.out.println(cal.sum(12, 8));
        System.out.println(cal.sum( (float)12.5, (float)8.5));
        System.out.println(cal.sum(12, 8,10));
       
    }
}

class Calculate { 
    int sum(int a , int b ){
        return a + b;
    }

    float sum(float a , float b ){
        return a + b ;
    }

    int sum(int a , int b , int c ){
        return a + b + c;
    }
}
