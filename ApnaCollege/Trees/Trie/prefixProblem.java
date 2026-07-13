public class prefixProblem {
    static class Trie{
        static class Node{
            Node[] children = new Node[26];
            boolean  eow = false;
            int freq;
            Node(){
                for (int i = 0; i < children.length; i++) {
                    children[i] = null;
                }
                freq = 1;
            }
        }
        public Node root = new Node();
        public void insert(String word){
            Node curr = root;
            for (int level = 0; level < word.length(); level++) {
                int idx = word.charAt(level) - 'a';
                if(curr.children[idx] == null){
                    curr.children[idx] = new Node();
                }
                else{
                    curr.children[idx].freq++;
                }
                curr = curr.children[idx];
            }
            curr.eow = true;
        }
        public void findprefix(Node root, String ans){
            if(root == null){
                return;
            }
            if(root.freq == 1){
                System.out.println(ans);
                return;
            }
            for (int i = 0; i < root.children.length; i++) {
                if(root.children[i] != null){
                    findprefix(root.children[i], ans + (char)(i + 'a'));
                }
            }
        }
    }
    public static void main(String[] args) {
        Trie trie = new Trie();
        String[] arr = {"zebra", "dog", "dove",  "duck"};
        
        for (String str : arr) {
            trie.insert(str);
        }
        trie.root.freq = -1;
        // System.out.println(trie.root.children.length);
        String ans = new String();
        trie.findprefix(trie.root, ans);
        System.out.println(ans);
    }
}
