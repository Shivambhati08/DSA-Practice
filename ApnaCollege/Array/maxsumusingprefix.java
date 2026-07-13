import java.util.Scanner;

public class maxsumusingprefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int prefix[] = new int[n];
        prefix[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i-1]+arr[i];
        }
        
        int maxsum = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int currsum;
                if(i == 0){
                    currsum = prefix[j];
                }
                else{
                    currsum = prefix[j]-prefix[i-1];
                }
                maxsum = Math.max(maxsum, currsum);
            }
        }
        System.out.println(maxsum);
        sc.close();
    }
}
