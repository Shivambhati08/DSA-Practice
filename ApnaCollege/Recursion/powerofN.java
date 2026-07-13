public class powerofN {
    public static int power(int a, int n){
        if(n == 0){
            return 1;
        }
        int half = power(a, n/2);
        int halfpowersqr = half*half;

        if(n % 2 != 0){
            halfpowersqr = a*halfpowersqr;
        }
        return halfpowersqr;
    }
    public static void main(String[] args) {
        System.out.println(power(2,10));
    }
}
