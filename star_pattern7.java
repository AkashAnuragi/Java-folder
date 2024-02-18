/* 

*        *
**      **
***    ***
****  ****
**********
**********
****  ****
***    ***
**      **
*        *
              */
              import java.util.Scanner;

              public class star_pattern7 {
                  public static void main(String[] args) {
                      Scanner sc = new Scanner(System.in);
                      System.out.println("Enter the number for star pattern : ");
                      int n = sc.nextInt();
                      // first pattern
                      for(int i = 1 ;i <=n ; i++){
                          for( int j =1 ;j<=i ; j++){
                             System.out.print("*");
                          }
                          for( int j=1 ;j<=(2*n-2*i) ; j++){
                             System.out.print(" ");
                          }
                          for( int j =1 ;j<=i ; j++){
                            System.out.print("*");
                         }
                          System.out.println();
                        }

                       // Second Patttern
                      for( int i = n ;i >=1 ; i--){
                          for( int j =1 ;j<=i ; j++){
                             System.out.print("*");
                          }
                          for( int j=1 ;j<=(2*n-2*i) ; j++){
                            System.out.print(" ");
                         }
                         for( int j =1 ;j<=i ; j++){
                           System.out.print("*");
                        }
                          System.out.println();
                        
                      }
                  }
              }
              