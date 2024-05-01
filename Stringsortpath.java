import java.util.*;

public class Stringsortpath {
    public static float ShortestPath(String path){
        int x =0;
        int y= 0;
        for(int i = 0 ;i<path.length() ;i++){
            char dir = path.charAt(i);

            // South
            if (dir == 'S') {
                y--;
            }

            //North
            else if(dir == 'N'){
                y++;
            }

            //East
            else if (dir =='E') {
                x++;
            }

            //West
            else{
                x--;
            }
        }
        float X1 =x*x;
        float X2 =y*y;
        return (float)Math.sqrt(X1 + X2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");  //WNEENESENNN
        String Str = sc.nextLine();
        System.out.println(ShortestPath(Str));

    }
}
