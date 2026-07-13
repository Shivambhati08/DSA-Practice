
import java.util.ArrayList;

public class insertInAheap {

    static class Heap {

        ArrayList<Integer> list = new ArrayList<>();

        public void insert(int val) {

            list.add(val);

            int x = list.size() - 1;
            int par = (x - 1) / 2;

            while (list.get(x) < list.get(par)) {
                int temp = list.get(x);
                list.set(x, list.get(par));
                list.set(par, temp);

                x = par;
                par = (x-1)/2;
            }
        }
        public int peek(){
            return list.get(0);
        }
        private void heapify(int i){
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
                list.set(minidx, list.get(i));
                list.set(i, temp);

                heapify(minidx);
            }
        }
        public int remove(){
            int data = list.get(0);

            // Step 1 Swap First and Last
            int temp = list.get(0);
            list.set(0, list.get(list.size()-1));
            list.set(list.size()-1, temp);

            // Step 2 Remove Last Element
            list.remove(list.size()-1);

            // Step 3 Heapify
            heapify(0);
            return data;
        }
        public boolean isEmpty(){
            return list.size() == 0;
        }
    }
    public static void main(String[] args) {
        int[] value = {2, 3, 4, 5, 10, 1};
        Heap heap = new Heap();
        for (int i = 0; i < value.length; i++) {
            heap.insert(value[i]);
        }
        while(!heap.isEmpty()){
            System.out.print(heap.remove()+" ");
        }
    }
}
