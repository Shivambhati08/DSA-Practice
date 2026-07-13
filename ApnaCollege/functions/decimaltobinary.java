public class decimaltobinary {
    public static int dectobin(int n){
        int bin = 0;
        int pow = 1;
        while(n != 0){
            bin += pow*(n%2);
            pow *= 10;
            n /= 2;
        }
        return bin;
    }
    public static void main(String[] args) {
           
            System.out.println(Integer.toBinaryString(8));
             System.out.println(dectobin(8));
    }
}
