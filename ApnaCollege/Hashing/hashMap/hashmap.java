import java.util.*;
public class hashmap {
    public static void main(String[] args) {
        HashMap<String , Integer> map = new HashMap<>();
        map.put("India", 150);
        map.put("China" , 50);
        map.put("USA", 200);

        System.out.println(map);
        
        Set<String> key = map.keySet();
        for (String string : key) {
            System.out.println("key = "+string+" -> "+map.get(string));
        }
    }
}
