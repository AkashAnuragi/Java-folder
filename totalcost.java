import java.util.*;
public class totalcost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pencil = sc.nextInt();
        int pen = sc.nextInt();
        int eraser = sc.nextInt();
        int total = pencil + pen + eraser ;
        System.out.println("Total Cost of the item is : " + total);

        //add a GST in tatal cost 
        float withGST = total + ( .18f * total);
        System.out.println("With 18% GST total cost is : " + withGST);
    }
    
}
