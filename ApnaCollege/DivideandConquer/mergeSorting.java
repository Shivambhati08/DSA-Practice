public class mergeSorting {
    public static void merge(int[] arr, int start, int end, int mid){
        int temp[] = new int[end - start + 1];
        int i = start;
        int j = mid+1;
        int k = 0;
        while(i <= mid && j <= end){
            if(arr[i] <= arr[j]){
                temp[k] = arr[i];
                i++;
            }
            else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        while(i <= mid){
            temp[k] = arr[i];
            i++;
            k++;
        }
        while(j <= end){
            temp[k] = arr[j];
            j++;
            k++;
        } 
        for(k = 0, i = start; k < temp.length; i++, k++){
            arr[i] = temp[k];
        }
    }
    public static void mergesort(int[] arr, int start, int end){
        if(start >= end){
            return;
        }
        int mid = start + (end-start)/2;

        mergesort(arr, start, mid);
        mergesort(arr, mid+1, end);
        merge(arr, start, end, mid);
    }
    public static void main(String[] args) {
       int[] arr = {6,3,9,5,2,8};
       mergesort(arr, 0, arr.length-1);
       for (int i : arr) {
            System.out.print(i+" ");
       } 
    }
}
