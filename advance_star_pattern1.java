/* 

    *
   ***
  *****
 *******
*********
*********
 *******
  *****
   ***
    *
              */
              import java.util.Scanner;

              public class advance_star_pattern1 {
                  public static void main(String[] args) {
                      Scanner sc = new Scanner(System.in);
                      System.out.println("Enter the number for star pattern : ");
                      int n = sc.nextInt();
                      // Fisrt part
                      for(int i = 1 ;i <=n ; i++){
                        for(int gap =1 ;gap<=n-i ;gap++){
                            System.out.print(" ");
                        }
                          for( int j =1 ;j<=2*i-1 ; j++){
                             System.out.print("*");
                          }
                            System.out.println();
                          }
                      for(int i = n ;i >=1 ; i--){
                        for(int gap =1 ;gap<=n-i ;gap++){
                            System.out.print(" ");
                        }
                          for( int j =1 ;j<=2*i-1 ; j++){
                             System.out.print("*");
                          }
                            System.out.println();
                          }
                        }
                  }
              
              