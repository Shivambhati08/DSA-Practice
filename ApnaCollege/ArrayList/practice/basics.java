import java.util.ArrayList;
public class basics{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        // System.out.println(list);
        // System.out.println(list.get(1));
        // // list.remove(1);
        // // System.out.println(list);
        // list.set(1, 30);
        // System.out.println(list);
        // System.out.println(list.contains(30));
        // System.out.println(list.contains(40));
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(list.size()-i-1)+" ");
            
        }

    }
}