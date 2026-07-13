package ApnaCollege.multidimentionalArrayList;

import java.util.ArrayList;

public class multilist {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(4);
        mainlist.add(list);
        mainlist.add(list2);
        System.out.println(mainlist);
    }
    
}
