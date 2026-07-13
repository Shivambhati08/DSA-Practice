public class arrayissortedandrotated{
     public static boolean check(int[] arr) {
        int n = arr.length;
        int i = 0; 
        int j = n-1;
        while(i < j){
            if(arr[i] < arr[i+1]) i++;
            else if(arr[j] > arr[j-1]) j--;
        }
        if(i == j){
            return true;
        }
        return false;  
    }
    public static void main(String[] args) {
        int[] arr = {3, 4,5, 1, 2};
        System.out.println(check(arr));
    }
}