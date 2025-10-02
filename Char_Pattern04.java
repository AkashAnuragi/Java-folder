/* 

A 
A B
A B C
A B C D
A B C D E
              */
              import java.util.*;

               class Char_Pattern04 {
                  public static void main(String[] args) {
                      Scanner sc = new Scanner(System.in);
                      System.out.print("Enter the number for char pattern : ");
                      
                      int n = sc.nextInt();
                      
                      for(int i = 1 ;i <=n ; i++){
                        char ch = 'A';
                          for( int j =1 ;j<=i ; j++){
                          System.out.print(ch+ " ");
                          ch++;
                          }
                          System.out.println();
                      }
                  }
              }
              