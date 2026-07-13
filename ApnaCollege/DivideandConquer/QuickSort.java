public class QuickSort {
    public static int partition(int[] arr,int si, int end){
        int pivot = arr[end];
        int idx = si-1;
        for (int i = si; i < end; i++) {
            if(arr[i] <= pivot){
                idx++;
                int temp = arr[i];
                arr[i] = arr[idx];
                arr[idx] = temp;
            }
        }
        idx++;
        int temp = pivot;
        arr[end] = arr[idx];
        arr[idx] = temp;
        return idx;
    }
    public static void quicksort(int[] arr,int si,int end){
        if(si >= end){
            return;
        }
        int pidx = partition(arr, si, end);
        quicksort(arr, si, pidx-1);
        quicksort(arr, pidx+1, end);
    }
    public static void main(String[] args) {
        int[] arr = {6,3,9,5,2,8};
        quicksort(arr, 0, arr.length-1);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
