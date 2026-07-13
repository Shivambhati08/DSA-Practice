
import java.util.ArrayList;

public class HeapOperation {
    static class Heap{
        ArrayList<Integer> list = new ArrayList<>();

        public void insert(int val){
            list.add(val);

            int child = list.size()-1;
            int parent = (child -1) / 2;

            while(list.get(child) < list.get(parent)){
                int temp = list.get(parent);
                list.set(parent, list.get(child));
                list.set(child,  temp);

                child = parent;
                parent = (child - 1)/ 2;
            }
        }
        public void heapify(int i){
            int minidx = i;
            int left = 2 * i + 1;
            int right = 2 * i + 2;

            if(left < list.size() && list.get(minidx) > list.get(left)){
                minidx = left;
            }
            if(right < list.size() && list.get(minidx) > list.get(right)){
                minidx = right;
            }
            if(minidx != i){
                int temp = list.get(minidx);
                list.set(minidx , list.get(i));
                list.set(i, temp);

                heapify(minidx);
            }
        }

        public int remove(){
            int data = list.get(0);

            int temp = list.get(0);
            list.set(0, list.get(list.size() - 1));
            list.set(list.size() -1 , temp);

            list.remove(list.size() -1 );

            heapify(0);
            return data;
        }
        public boolean isEmpty(){
            return list.size() == 0;
        }
    }
    public static void main(String[] args) {
        int[] values = {2, 4, 6, 7, 1,8 , 9};
        Heap heap = new Heap();
        for (int i = 0; i < values.length; i++) {
            heap.insert(values[i]);
        }
        while(!heap.isEmpty()){
            System.out.print(heap.remove()+" ");
        }
    }
}
