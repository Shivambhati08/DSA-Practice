public class buyandsellstock {
    public static void main(String[] args) {
        int arr[] = {7,1,5,3,6,4};
        int buyprice = arr[0];
        int profit = 0;
        for (int i = 0; i < arr.length; i++) {

            int currprofit = arr[i]-buyprice;
            profit = Math.max(currprofit, profit);

            buyprice = Math.min(arr[i], buyprice);
        }
        System.out.println("Maximum profit : "+profit);
    }
}
