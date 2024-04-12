import java.util.*;
public class exceptions2 {
    static void checkAge(int age){
        if(age<18){
            throw new ArithmeticException("Access denied : You must be atleast 18 year old");
        }
        else{
            System.out.println("Access Granted : You are old enough!");
        }
    }
    public static void main(String[] args) {
        checkAge(12);
    }
}