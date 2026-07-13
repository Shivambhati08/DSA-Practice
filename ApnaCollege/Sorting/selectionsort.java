public class selectionsort {
    public static void selection(int arr[]){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int min = arr[i];
            int index = i;
            for (int j = i+1; j < n; j++) {
                if(min > arr[j]){
                    min = arr[j];
                    index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        selection(arr);
        for (int ele : arr) {
            System.out.print(ele+" ");
        }
    }
}
