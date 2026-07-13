
import java.util.HashSet;

public class hashsetIterator {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Delhi");
        set.add("Noida");
        set.add("Gurgaon");
        set.add("Bengaluru");

        // Iterator it = set.iterator();
        // while(it.hasNext()){
        //     System.out.println(it.next());
        // }
        for (String str : set) {
            System.out.println(str);
            
        }
    }
}
