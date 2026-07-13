
import java.util.Scanner;

public class dectobin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dec = sc.nextInt();
        int num = 0;
        int pow = 0;
        while(dec != 0){
            int rem  = dec % 2;
            num += Math.pow(10, pow) * rem;
            pow += 1;
            dec /= 2;
        }
        System.out.println(num);
        sc.close();
    }
}
