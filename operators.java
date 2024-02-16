import java.util.*;
public class operators {
    public static void main(String[] args) {

        //Arithmetic  Operator :-  +, -, *, /, %, ++, --

        System.out.println("Arithmetic Operators\n\n");
        int a = 5 ;
        int b = 15 ;
        int sum = a + b;
        int sub = a - b;
        int mul = a * b;
        int div = a / b;
        int mod = a % b;
        System.out.println("sum is :"+ sum);
        System.out.println("sub is :"+ sub);
        System.out.println("mul is :"+ mul);
        System.out.println("div is :"+ div);
        System.out.println("mod is :"+ mod);


        // pre increment, and decrement
       /* int c = ++b;  
        int d = --a;  
        System.out.println(c);
        System.out.println(b);

        System.out.println(d);
        System.out.println(a); */

        //post increment and decrement
        int c = b++;  
        int d = a--;  
        System.out.println(c);
        System.out.println(b);

        System.out.println(d);
        System.out.println(a);

         // ASSSIGNMENT OPERATOR:-  (=, +=, -=, *=, /=, %=, &=, |=, ^=, >>=, <<=)
         System.out.println("\n\nAssignment Operators");

         int x = 12;
         int y = 24;
         x += y;
         System.out.println("sum : " +x);

         x -= y;
         System.out.println("sub : " +x);

         x *= y;
         System.out.println("mul : " +x);

         y /= b;
         System.out.println("div : " +y);

         a %= x;
         System.out.println("mod : " +a);

         a &= x;
         System.out.println("AND : " +a);

         x |= 2;
         System.out.println(" bitwise OR : " +x);

         x ^= y;
         System.out.println("bitwise XOR : " +x);

         x >>= 12;
         System.out.println("greater than : " +x);

         x <<= -1;
         System.out.println("less than : " +x);

         System.out.println("\n\n");
         // Compersion Operators:- (==, !=, >, <, >=, <=)

         System.out.println("Compersion Operators\n");

         System.out.println(12==12); //equal to 
         System.out.println(12!=12); // Not eqal to 
         System.out.println(12>23);  //Greater than
         System.out.println(12>=23);  //Greater than equal to
         System.out.println(1<3);  //Less than
         System.out.println(12<=3);  //Less than equal to

         System.out.println("\n\n");
         // Logical Operator:- (&&, ||, !)
         System.out.println("Logical Operators");

         System.out.println(12<3 && 12>5); //AND Operator
         System.out.println(12<3 || 12>5); // OR Operator
         System.out.println(!(12==12));    // NOT Operator

    }
}
