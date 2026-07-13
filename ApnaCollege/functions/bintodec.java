import java.util.Scanner;
public class bintodec{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int bin = sc.nextInt();
        int num = 0;
        int temp = bin;
        int i = 0;
        while(temp != 0){
            int rem = temp % 10;
            num += Math.pow(2, i) * rem;
            i += 1;
            temp /= 10;
        }
        System.out.println(num);
        sc.close();
    }
}