public class firstnonrepeatingchar {
    public static void main(String[] args) {
        String str = "aabccxb";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
             if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                System.out.println(ch);
                return;
             }
        }
        System.out.println(-1);
    }
}
