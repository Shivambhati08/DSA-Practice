public class searchinSortedandRotatedarray {
    public static int searchinrotated(int[] arr, int si, int end, int key){
        if(si > end){
            return -1;
        }
        int mid = si + (end-si)/2;

        if(arr[mid] == key){
            return mid;
        }
        if(arr[si] <= arr[mid]){
            if(arr[si] <= key && key < arr[mid]){
                return searchinrotated(arr, si, mid-1, key);
            }
            else{
                return searchinrotated(arr, mid+1, end, key);
            }
        }
        else{
            if(arr[mid] < key && key <= arr[end]){
                return searchinrotated(arr, mid+1, end, key);
            }
            else{
                return searchinrotated(arr, si, mid-1, key);
            }
        }

    }
    public static int search(int[] arr, int key){
        int idx = searchinrotated(arr, 0, arr.length-1, key);
        return idx;
    }
    public static void main(String[] args) {
        // int[] arr = {4,5,6,7,0,1,2};
        int[] arr = {3, 1};
        System.out.println(search(arr, 1));
    }
}
