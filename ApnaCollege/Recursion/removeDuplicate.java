
public class removeDuplicate {
    public static String remduplic(String str, int i, String str1){
        if(i == str.length()){
            return str1;
        }
        char ch = str.charAt(i);
        if(str1.indexOf(ch) == -1){
            str1 += ch;
        }
        return remduplic(str, i+1, str1);
    }
    public static void main(String[] args) {
        System.out.println(remduplic("appnnacollege", 0, ""));        
    }
}
