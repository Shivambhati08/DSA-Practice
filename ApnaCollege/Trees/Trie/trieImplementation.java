import java.util.*;;

public class trieImplementation {
    static class Trie{
    static class Node{
            Node[] children = new Node[26];
            boolean eow = false;
            Node(){
                for(int i = 0; i < 26; i++){
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
                int idx = word.charAt(level) - 'a';
                if(curr.children[idx] == null){
                    return false;
                }
                curr = curr.children[idx];
            }
            return curr.eow == true;
        }
        public boolean startswith(String word){
            Node curr = root;
            for (int i = 0; i < word.length(); i++) {
                int idx = word.charAt(i) - 'a';
                if(curr.children[idx] == null){
                    return false;
                }
                curr = curr.children[idx];
            }
            return true;
        }
        public int countuniquesubstring(Node root){
            if(root == null){
                return 0;
            }
            int count = 0;
            for (int i = 0; i < 26; i++) {
                if(root.children[i] != null){
                    count += countuniquesubstring(root.children[i]);
                }
            }
            return count + 1;
        }
        public String ans = "";
        public void longestwordwithallprefix(Node root, StringBuilder sb){
            if(root == null){
                return;
            }
            for(int i = 0; i < 26; i++){
                if(root.children[i] != null && root.children[i].eow == true){
                    char ch = (char)(i + 'a');
                    sb.append(ch);
                    if(sb.length() > ans.length()){
                        ans = sb.toString();
                    }
                    longestwordwithallprefix(root.children[i], sb);
                    sb.deleteCharAt(sb.length() -1);
                }
            }
        }
    }
    public static void main(String[] args) {
        // String words[] = {"the", "a", "there", "their", "any", "thee"};
        Trie trie = new Trie();
        // for(int i = 0; i < words.length; i++){
        //     trie.insert(words[i]);
        // }
        // // System.out.println(trie.search("there"));
        // // System.out.println(trie.search("their"));
        // // System.out.println(trie.search("any"));

        // System.out.println(trie.startswith("th"));
        // String str = "ababa";
        // for (int i = 0; i < str.length(); i++) {
        //     String suffix = str.substring(i);
        //     trie.insert(suffix);
        // }
        // System.out.println(trie.countuniquesubstring(trie.root));
        String[] words = {"a", "banana", "app", "appl", "ap", "apply", "apple"};
        for (int i = 0; i < words.length; i++) {
            trie.insert(words[i]);
        }
        trie.longestwordwithallprefix(trie.root, new StringBuilder());
        System.out.println(trie.ans);
    }
}
