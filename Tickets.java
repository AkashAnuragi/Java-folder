import java.util.*;
public class Tickets {
    public static String getStart(HashMap<String,String> map) {
        HashMap<String, String> revMap = new HashMap<>();
        for(String key : map.keySet() ){
            revMap.put(map.get(key), key);
        }

        for(String key : map.keySet()) {
            if(!revMap.containsKey(key)){
                return key;  //Starting point
            }
        }
        return null;
    }
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put("Chennai","Bangaluru");
        map.put("Mumbai","Delhi");
        map.put("Goa", "Chennai");
        map.put("Delhi","Goa"); 

        String start = getStart(map);
        System.out.print(start);
        for (String key : map.keySet()) {
            System.out.print(" -> " + map.get(start));
            start = map.get(start);
        }
        System.out.println();
    }
}
