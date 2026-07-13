public class squareofasortedarray {
    public static void main(String[] args) {
        int[] arr = {-4, -1, 0, 3, 10};
        int n = arr.length;
        int left = 0;
        int right = n-1;
        int[] ans = new int[n];
        int idx = n-1;
        while(left <= right){
            int leftsq = arr[left] * arr[left];
            int rightsq = arr[right] * arr[right];

            if(leftsq > rightsq){
                left++;
            }
            else{
                right--;
            }
            ans[idx--] = Math.max(leftsq, rightsq);
        }
        for (int i : ans) {
            System.out.print(i+" ");
        }
    }
}
