import java.util.Scanner;

public class buyandsellstocks {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int price[] = new int[n];
        for (int i = 0; i < n; i++) {
            price[i] = sc.nextInt();
        }
        int buyprice = price[0];
        int maxprofit = 0;
        for (int i = 1; i < n; i++) {
            int profit = price[i] - buyprice;

            maxprofit = Math.max(maxprofit, profit);

            buyprice = Math.min(buyprice, price[i]);
        }
        System.out.println(maxprofit);
    }
}
