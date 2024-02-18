/* 

    1   
   222  
  33333 
 4444444
555555555
              */
              import java.util.Scanner;

              public class advance_star_pattern2 {
                  public static void main(String[] args) {
                      Scanner sc = new Scanner(System.in);
                      System.out.println("Enter the number for star pattern : ");
                      int n = sc.nextInt();
                      
                      for(int i = 1 ;i <=n ; i++){
                        for(int gap =1 ;gap<=n-i ;gap++){
                            System.out.print(" ");
                        }
                          for( int j =1 ;j<=2*i-1 ; j++){
                             System.out.print(i);
                          }
                            System.out.println();
                          }
                  }
              }
              