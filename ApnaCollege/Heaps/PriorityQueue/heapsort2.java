public class heapsort2 {
    public static void heapify(int[] arr, int i , int size){
        int maxidx = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

       if(left < size && arr[maxidx] < arr[left]){
            maxidx = left;
       }
       if(right < size && arr[maxidx] < arr[right]){
        maxidx = right;
       }
        if(maxidx != i){
            int temp = arr[i];
            arr[i] = arr[maxidx];
            arr[maxidx] = temp;

            heapify(arr, maxidx, size);
        }
    }

    public static void heapsort(int[] arr){
        int n = arr.length;
        for (int i = n/2; i >= 0; i--) {
            heapify(arr, i, n);
        }
        for (int i = n-1; i >= 0; i--) {
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;
            heapify(arr, 0, i);
        }
    }
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 6,7 ,1};
        heapsort(arr);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
