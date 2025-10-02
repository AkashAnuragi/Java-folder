
//     A    
//    ABA   
//   ABCBA  
//  ABCDCBA 
// ABCDEDCBA

public class Char_Pattern02 {
 public static void main(String[] args) {
    int n =5;
    for(int i = 1; i<=n; i++){
        char ch = 'A';
        for(int gap=1;gap<=n-i;gap++){
            System.out.print(" ");
        }
        for(int j = 1;j<=2*i-1;j++){
            if(j<i){
                System.out.print(ch);
                ch++;
            }else{
                System.out.print(ch);
                --ch;
            }
        }
        System.out.println();
    }
 }
}
