public class binaryStringsProblem {
    public static void binaryStringWays(int n, int lastplace, String str){
        if(n == 0){
            System.out.println(str);
            return;
        }
        binaryStringWays(n-1, 0 , str+"0");
        if(lastplace == 0){
            binaryStringWays(n-1, 1, str+"1");
        }
    }
    public static void main(String[] args) {
        binaryStringWays(3, 0, "");
    }
}
