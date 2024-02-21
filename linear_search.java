import java.util.*; 

public class linear_search {
    public static int linearSearch(int number[], int key) {
        for(int i=0 ;i<number.length ;i++){
            if(number[i] == key){
                return i; 
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int number[] = {2, 4, 5, 10, 45, 67, 90};
        
        int key = 2;
        int index = linearSearch(number, key);
        if (index == -1) {
            System.out.println("NOT FOUND");
        }
        else{
            System.out.println("Key is index at : " +index);
        }

    }
}
