

public class productofarrayexceptself {
    // 1. using prefix and suffix arrays
    public static void productbypreandsuf(int[] arr){
        int n = arr.length;
        int[] pre = new int[n];
        int[] suf = new int[n];
        int[] ans = new int[n];
        pre[0] = 1;
        suf[n-1] = 1;

        for (int i = 1; i < n; i++) {
            pre[i] = pre[i-1] * arr[i-1];
        }
        for(int i = n-2; i >= 0; i--){
            suf[i] = suf[i+1] * arr[i+1];
        }
        for(int i = 0; i < n; i++){
            ans[i] = pre[i] * suf[i];
        }
        for (int i : ans) {
            System.out.print(i+" ");
        }
    }
    // 2. without using extra space
    public static void productwithoutspace(int[] arr){
        int suf = 1;
        int n = arr.length;
        int[] ans = new int[n];
        ans[0] = 1;
        
        for (int i = 1; i < n; i++) {
            ans[i] = arr[i-1] * ans[i-1];
        }
        for(int i = n-2; i>= 0; i--){
            suf *= arr[i + 1];
            ans[i] *= suf;
        }
        for (int i : ans) {
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        // int[] arr = {-1, 1, 0, -3, 3};
        int[] arr = {1, 2, 3, 4};

        // productbypreandsuf(arr);
        productwithoutspace(arr);

    }
}
