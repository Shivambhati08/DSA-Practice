public class sortcharacterbyfreq {
    public static void main(String[] args) {
        String str = "tree"; // "tree"

        int[] freq = new int[26];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch - 'a']++;
        }
        for (int i = 0; i < freq.length; i++) {
            if(freq[i] > 0){
                while(freq[i] > 0){
                    System.out.print((char)(i + 97));
                    freq[i]--;
                }
            }
            
        }
        
    }
}
