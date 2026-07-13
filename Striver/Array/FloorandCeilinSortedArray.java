public class FloorandCeilinSortedArray{
    public static int[] findfloorandceil(int[] arr, int x){
        int n = arr.length;
        int low = 0, high = n-1;
        int floar = -1;
        int ceil = -1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(arr[mid] == x){
                return new int[]{arr[mid], arr[mid]};
            }
            else if(arr[mid] <= x){
                floar = mid;
                low = mid + 1;
            }
            else{
                ceil = mid;
                high = mid - 1;
            }
        }
        return new int[]{arr[floar], arr[ceil]};
    }
    public static void main(String[] args){
        int[] arr = {10, 20, 30, 40, 50};
        int x = 25;
        int[] floarandceil = findfloorandceil(arr, x);
        System.out.println(floarandceil[0]+" "+floarandceil[1]);
    }
}