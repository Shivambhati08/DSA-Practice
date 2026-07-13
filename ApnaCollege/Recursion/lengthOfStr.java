public class lengthOfStr {
    public static int lengthOfString(String str,int count){
        if(count == str.length()){
            return count;
        }
        return lengthOfString(str, count+1);
    }
    public static void main(String[] args) {
        System.out.println("Shivam Thakur".length());
        System.out.println(lengthOfString("Shivam Thakur", 0));
    }
}
