
import java.util.*;

public class newpractice{
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        // list.add(10);
        // list.add(20);
        // list.add(1, 30);
        // list.add(0, 40);
        // int value = list.get(3);
     
        // System.out.println(list.get(1));
        // System.out.println(value);
        // list.set(0, 5);
        // list.remove(Integer.valueOf(20));
        // list.remove(0);
        
        // System.out.println(list.size());
        // System.out.println(list.contains(30));
        // list.clear();
        //    for(int ele: list){
        //     System.out.print(ele+" ");
        // }
        // Object arr[] = list.toArray();
        // for (Object elem : arr) {
        //     System.out.print(elem+" ");
            
        // }
        list.add(5);
        list.add(4);
        list.add(1);
        list.add(-1);
        // ArrayList<Integer> copy = (ArrayList<Integer>)list.clone();
        // for (int elem : copy) {
        //     System.out.print(elem+" ");
        // }
        Collections.sort(list);
        
        list.addFirst(10);
        // for (int ele : list) {
        //     System.out.print(ele+" ");
        // }
        // list.forEach(System.out::print(+" "));
        // list.forEach(ele -> System.out.print(ele+" "));
        int[][] arr = {{10,20},{30,40},{50}};
        // for (int ele : arr) {
        //     System.out.print(ele+" ");
        // }
        // for (int[] i : arr) {
        //     for (int j : i) {
        //         System.out.print(j+" ");S
        //     }
        //     System.out.println();
        // 
    //     String str = "yami       tripathi  is a best      girl";
    //     String parts[] = str.split("\\s+");
    //    for(String st : parts){
    //     System.out.println(st);
    //    } 
    Object brr[] = {10,20,30,40,50};
    for (Object object : brr) {
        System.out.print(object+" ");
    }

    }
}