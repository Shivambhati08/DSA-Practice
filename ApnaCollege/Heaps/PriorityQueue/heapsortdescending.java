public class heapsortdescending {
    public static void heapify(int[] arr, int i , int size){
        int minidx = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

       if(left < size && arr[minidx] > arr[left]){
            minidx = left;
       }
       if(right < size && arr[minidx] > arr[right]){
        minidx = right;
       }
        if(minidx != i){
            int temp = arr[i];
            arr[i] = arr[minidx];
            arr[minidx] = temp;

            heapify(arr, minidx, size);
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

