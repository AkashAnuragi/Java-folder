/* 

A
B C 
D E F 
G H I J
              */
              import java.util.*;

              public class char_pattern1 {
                  public static void main(String[] args) {
                      Scanner sc = new Scanner(System.in);
                      System.out.println("Enter the number for char pattern : ");
                      char ch = 'A';
                      int n = sc.nextInt();
                      
                      for(int i = 1 ;i <=n ; i++){
                          for( int j =1 ;j<=i ; j++){
                          System.out.print(ch);
                          ch++;
                          }
                          System.out.println();
                      }
                  }
              }
              
