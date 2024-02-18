/* 

    *****
   *****
  *****
 *****
*****
              */
              import java.util.Scanner;

              public class star_pattern8 {
                  public static void main(String[] args) {
                      Scanner sc = new Scanner(System.in);
                      System.out.println("Enter the number for star pattern : ");
                      int n = sc.nextInt();
                      
                      for(int i = 1 ;i <=n ; i++){
                        for(int gap =1 ;gap<=n-i;gap++){
                            System.out.print(" ");
                        }
                          for( int j =1 ;j<=n ; j++){
                             System.out.print("*");
                          }
                          System.out.println();
                      }
                  }
              }
              