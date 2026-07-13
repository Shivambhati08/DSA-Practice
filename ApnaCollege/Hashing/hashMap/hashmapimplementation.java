
import java.util.*;

public class hashmapimplementation {

    static class HM<K, V> {

        private class Node {

            K key;
            V value;

            Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }
        private int n;
        private int N;
        private LinkedList<Node> buckets[];

        @SuppressWarnings("unchecked")
        public HM() {
            this.N = 4;
            this.buckets = new LinkedList[4];
            for (int i = 0; i < 4; i++) {
                this.buckets[i] = new LinkedList<>();
            }
        }

        private int hashfunction(K key) {
            return (Math.abs(key.hashCode()) % N);
        }

        private int searchinLL(K key, int bi) {
            LinkedList<Node> ll = buckets[bi];
            int di = 0;
            for (int i = 0; i < ll.size(); i++) {
                if (ll.get(i).key == key) {
                    return di;
                }
                di++;
            }
            return -1;
        }
        
        @SuppressWarnings("unchecked")
        private void rehash() {
            LinkedList<Node> oldBuck[] = buckets;
            N = 2 * N;
            buckets = new LinkedList[N];

            for (int i = 0; i < buckets.length; i++) {
                buckets[i] = new LinkedList<>();
            }
            // Nodes add in bucket
            for (int i = 0; i < oldBuck.length; i++) {
                LinkedList<Node> ll = oldBuck[i];
                for (int j = 0; j < ll.size(); j++) {
                    Node node = ll.remove();
                    put(node.key, node.value);

                }

            }
        }

        public void put(K key, V value) {
            int bi = hashfunction(key);
            int di = searchinLL(key, bi);

            if (di != -1) {
                Node node = buckets[bi].get(di);
                node.value = value;
            } else {
                buckets[bi].add(new Node(key, value));
                n++;
            }
            double lambda = (double) n / N;
            if (lambda > 2.0) {
                rehash();
            }
        }

        public boolean containsKey(K key) {
            int bi = hashfunction(key);
            LinkedList<Node> ll = buckets[bi];
            for (Node node : ll) {
                if (Objects.equals(node.key, key)) {
                    return true;
                }
            }
            return false;
        }
        public V remove(K key){
            int bi = hashfunction(key);

            for (Node node : buckets[bi]) {
                if(node.key.equals(key)){
                    Node nod = buckets[bi].remove();
                    n--;
                    return nod.value;
                }
            }
            return null;
        }
        public List<K> keySet(){
            List<K> keys = new ArrayList<>();
            for (int i = 0; i < buckets.length; i++) {
                LinkedList<Node> ll = buckets[i];
                for (Node node : ll) {
                    keys.add(node.key);
                }
            }
            return keys;
        }
        public boolean isEmpty(){
            return buckets.length == 0;
        }

        public V get(K key) {
            int bi = hashfunction(key);

            for (Node node : buckets[bi]) {
                if (node.key.equals(key)) {
                    return node.value;
                }
            }
            return null;
        }
    }

    public static void main(String[] args) {

        HM<String, Integer> map = new HM<>();
        map.put("India", 250);
        map.put("China", 50);
        map.put("USA", 100);

        List<String> keys = map.keySet();

        for (String key : keys) {
            System.out.println(key);
        }

        System.out.println(map.get("India"));
        System.out.println(map.remove("India"));
        System.out.println(map.get("India"));
    }

}
