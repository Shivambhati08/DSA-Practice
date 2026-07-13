
import java.util.Scanner;

public class binomialcoefficient {
    public static int fact(int n){
        if(n == 0){
            return 1;
        }
        return n*fact(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int binomialcoeff = fact(n)/(fact(r)*fact(n-r));
        System.out.println(binomialcoeff);
        sc.close();
    }
}
