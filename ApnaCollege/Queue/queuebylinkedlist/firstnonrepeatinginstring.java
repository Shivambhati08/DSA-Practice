public class firstnonrepeatinginstring {
    public static void main(String[] args) {
        String str = "aabccxb";
        int[] freq = new int[26];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch-'a']++;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(freq[ch-'a'] == 1){
                System.out.println(ch);
                return;
            }
        }
        System.out.println(-1);
    }
}
