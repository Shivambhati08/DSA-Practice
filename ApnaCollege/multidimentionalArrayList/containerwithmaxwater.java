import java.util.ArrayList;

public class containerwithmaxwater {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);

        int lht = 0;
        int rht = list.size()-1;
        int maxwater = 0;
        while(lht < rht){
            int ht = Math.min(list.get(lht), list.get(rht));
            int wd = rht - lht;
            int currwater = ht * wd;
            maxwater = Math.max(currwater, maxwater);
            if(list.get(lht) < list.get(rht)){
                lht++;
            }
            else{
                rht--;
            }
        }
        System.out.println(maxwater);
    }
}
