public class reverseString{
    public static void main(String[] args){
        String str = "Geeks";
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        System.out.println(sb.toString());
    }
}