import java.util.ArrayList;

public class Multi_ArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> MainList = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        for(int i = 1; i<=5;i++){
            list.add(i*1);  // 1 2 3 4 5 
            list2.add(i*2); // 2 4 6 8 10
            list3.add(i*3); // 3 6 9 12 15
        }

        // list.add(1);
        // list.add(2);
        // list.add(3);
        // list.add(4);
        // list.add(5);
        MainList.add(list);
       
        // list2.add(2);
        // list2.add(4);
        // list2.add(6);
        // list2.add(8);
        // list2.add(10);
        MainList.add(list2);

        // list3.add(3);
        // list3.add(6);
        // list3.add(9);
        // list3.add(12);
        // list3.add(15);
        MainList.add(list3);
        

        for(int i = 0; i<MainList.size(); i++){
            ArrayList<Integer> CurrList = MainList.get(i);
            for(int j=0; j<CurrList.size(); j++){
                System.out.print(CurrList.get(j) + " ");
            }
            System.out.println();
        }
        System.out.println(MainList);
    }
}
