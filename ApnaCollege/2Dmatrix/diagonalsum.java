
import java.util.Scanner;

public class diagonalsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int diagsum = 0;
        for (int i = 0; i < n; i++) {
            diagsum += arr[i][i];
            if(i != (n-i-1)){
                diagsum += arr[i][n-i-1];
            }
        }
        System.out.println(diagsum);
        sc.close();
    }
}
