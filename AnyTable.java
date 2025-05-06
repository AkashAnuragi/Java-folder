// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class AnyTable {
    public static int[] Table(int n){
        int res[] = new int[10];
        
        for(int i = 0; i<10;i++){
            res[i] = n*(i+1);
        }
        return res;
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the Table which You Want: ");
       int n = sc.nextInt();
       
       int res[] = Table(n);
       for(int j= 0; j<10; j++){
           System.out.println(n + " * " + (j+1)+ " = " + res[j]);
       }
       
    }
}
