
public class buyandsellusingfunction {
    public static int maxpro(int arr[]){
        int buyprice = arr[0];
        int maxprofit = 0;
        for (int i = 1; i < arr.length; i++) {
            if(buyprice < arr[i]){
                maxprofit = Math.max(arr[i] - buyprice, maxprofit);
            }
            else{
                buyprice = arr[i];
            }
        }
        return maxprofit;
    }
    public static void main(String[] args) {
        int prices[] = {7,6,4,3,1};
        int maxprofit = maxpro(prices);
        System.out.println(maxprofit);
    }
}
