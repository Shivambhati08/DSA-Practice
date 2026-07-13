public class binomialcoafficient {
    public static int factorial(int n){
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
    public static void main(String[] args) {
        int n = 3;
        int r = 1;
        double result = factorial(n)/(factorial(r)*factorial(n-r));
        System.out.println(result);
    }
}
