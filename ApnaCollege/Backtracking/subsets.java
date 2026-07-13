
public class subsets {
    public static void printsubset(String str, int i, String ans){
        if(i == str.length()){
            System.out.println(ans);
            return;
        }
        
        printsubset(str, i+1, ans+str.charAt(i));
        printsubset(str, i+1, ans);
    }
    public static void main(String[] args) {
        String str = "abc";
        printsubset(str, 0, "");
    }
}
