public class printprime1to50{
    public static void isPrime(int n){
        if(n<= 1){
            return;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0){
                return;
            }
        }
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            isPrime(i);
        }
    }
}