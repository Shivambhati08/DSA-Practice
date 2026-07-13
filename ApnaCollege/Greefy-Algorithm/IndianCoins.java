

public class IndianCoins {
    public static void main(String[] args) {
        int[] arr = {1,2,5,10,20,50,100,500,2000};
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        int value = 590;
        int mincoin = 0;
        for (int i = 0; i < arr.length; i++) {
            while(value >= arr[i]){
                mincoin++;
                value -= arr[i];
            }
        }
        System.out.println(mincoin);
    }
}
