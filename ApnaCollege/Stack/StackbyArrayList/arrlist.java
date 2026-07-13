
import java.util.ArrayList;

public class arrlist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        System.out.println(list);
        
        // System.out.println(list.get(30));
        System.out.println(list.get(1));

        list.remove(1);
        System.out.println(list);

        list.remove(0);
        System.out.println(list);


        
    }
}
