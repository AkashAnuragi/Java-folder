/* 

 * * * *
 * * *
 * * 
 * 
              */
              import java.util.Scanner;

              public class star_pattern2 {
                  public static void main(String[] args) {
                      Scanner sc = new Scanner(System.in);
                      System.out.println("Enter the number for star pattern : ");
                      int n = sc.nextInt();
                      
                      for(int i = n ;i >=1 ; i--){
                          for( int j =1 ;j<=i ; j++){
                             System.err.print("*");
                          }
                          System.out.println();
                      }
                  }
              }
              