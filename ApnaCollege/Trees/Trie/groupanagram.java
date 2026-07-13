import java.util.*;
public class groupanagram {
    public static void main(String[] args) {
        String[] str = {"eat", "tea", "tan", "ate", "nat", "bat"};
        HashMap<String, List<String>> map = new HashMap<>();
        for (String s : str) {
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String key = String.valueOf(c);
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(s);
        }
        System.out.println(map.values());
    }
}
