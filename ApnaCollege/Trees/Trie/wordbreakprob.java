public class wordbreakprob{
    static class Trie{
        static class Node{
            Node[] children = new Node[26];
            boolean eow = false;
            Node(){
                for(int i = 0; i< children.length; i++){
                    children[i] = null;
                }
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
                curr = curr.children[idx];
            }
            curr.eow = true;
        }
        public boolean search(String word){
            Node curr = root;
            for (int level = 0; level < word.length(); level++) {
                int idx = word.charAt(level)  - 'a';
                if(curr.children[idx] == null){
                    return false;
                }
                curr = curr.children[idx];
            }
            if(curr.eow == true){
                return true;
            }
            return false;
        }
        public boolean wordBreak(String key){
            if(key.length() == 0){
                return true;
            }
            for (int i = 1; i <= key.length(); i++) {
                if(search(key.substring(0, i)) && wordBreak(key.substring(i))){
                    return true;
                }
            }
            return false;
        }
    }
    public static void main(String[] args) {
        String[] words = {"i", "like", "sam", "samsung", "mobile", "ice"};
        Trie trie = new Trie();
        for (int i = 0; i < words.length; i++) {
                trie.insert(words[i]);
        }
        // System.out.println(trie.search("love"));
        String key = "ilikesamsung";
        System.out.println(trie.wordBreak(key));
    }
}