import java.util.HashMap;

public class validanagram {
    public static void main(String[] args) {
        String s = "earth";
        String t = "heart";
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char key = s.charAt(i);
            map.put(key, map.getOrDefault(key, 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            char key = t.charAt(i);
            if(map.get(key) != null) {
                if(map.get(key) == 1){
                    map.remove(key);
                }
                else{
                    map.put(key, map.get(key) -1);
                }
            }
            else{
                System.out.println("Not anagram");
                return;
            }
        }
        if(map.isEmpty()){
            System.out.println("Anagaram");
        }
        else{
            System.out.println("Not anagram");
        }
    }
}
