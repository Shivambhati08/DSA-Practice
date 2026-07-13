public class nextpermutation {
    public static void nextper(int[] arr){
        int n = arr.length;
        int idx = -1;
        for(int i = n-2; i >= 0; i--){
            if(arr[i] < arr[i+1]){
                idx = i;
                break;
            }
        }
        if(idx == -1){
            reverse(arr, 0, n-1);
            return;
        }
        for(int i = n-1; i > idx; i--){
            if(arr[i] > arr[idx]){
                swap(arr, i, idx);
                break;
            }
        }
        reverse(arr, idx + 1, n-1);
    }
    public static void reverse(int[] arr, int i, int j){
        while(i < j){
            swap(arr, i, j);
            i++;
            j--;
        }
    }
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void print(int[] arr){
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int[] brr = {3, 2, 1};
        int[] crr = {1,1, 5};
        nextper(arr);
        nextper(brr);
        nextper(crr);
        print(arr);
        print(brr);
        print(crr);
    }
}
