
public class backtrackinarray {
    public static void fillarray(int[] arr, int i){
        if(i == arr.length){
            return;
        }
        arr[i] = i+1;
        fillarray(arr, i+1);
        arr[i] -= 2;
    }
    public static void main(String[] args) {
        int[] arr = new int[5];  
        fillarray(arr, 0);  
        for (int i : arr) {
            System.out.print(i+" ");
        }    
    }
}
