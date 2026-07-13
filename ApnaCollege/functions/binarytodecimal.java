public class binarytodecimal{
    public static int bintodec(int n){
        int dec = 0;
        int pow = 1;
        while(n != 0){
            dec += pow*(n%10);
            pow *= 2;
            n /= 10;
        }
        return dec;
    }
    public static void main(String[] args) {
       
        System.out.println(Integer.bitCount(10));
        System.out.println(Integer.bitCount(7));
    }
        
}   
