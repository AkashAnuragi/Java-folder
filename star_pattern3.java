/* 

1
1 2 
1 2 3 
1 2 3 4
              */
              import java.util.Scanner;

              public class star_pattern3 {
                  public static void main(String[] args) {
                      Scanner sc = new Scanner(System.in);
                      System.out.println("Enter the number for star pattern : ");
                      int n = sc.nextInt();
                      
                      for(int i = 1 ;i <=n ; i++){
                          for( int j =1 ;j<=i ; j++){
                          System.out.print(j);
                          }
                          System.out.println();
                      }
                  }
              }
              