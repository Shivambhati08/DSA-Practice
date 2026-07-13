import java.util.Stack;

public class maxareainHistogram {
    public static void nextsmlft(int[] arr, int[] brr){
        Stack<Integer> stack = new Stack<>();
        brr[0] = -1;
        for(int i = 0; i <arr.length; i++){
            while(!stack.isEmpty() && arr[i] <= arr[stack.peek()]){
                stack.pop();
            }
            if(stack.isEmpty()){
                brr[i] = -1;
            }
            else{
                brr[i] = stack.peek();
            }
            stack.push(i);
        }
    }
    public static void nextsmright(int[] arr, int[] brr){
        Stack<Integer> stack = new Stack<>();
        brr[brr.length-1] = -1;
        for(int i = arr.length-1; i>= 0; i--){
            while(!stack.isEmpty() && arr[i] <= arr[stack.peek()]){
                stack.pop();
            }
            if(stack.isEmpty()){
                brr[i] = arr.length;
            }
            else{
                brr[i] = stack.peek();
            }
            stack.push(i);

        }
    }
    public static int maxareahis(int[] arr){
        int[] nxtsmrht = new int[arr.length];
        int[] nxtsmlft = new int[arr.length];

        int max = 0;
        nextsmright(arr, nxtsmrht);
        nextsmlft(arr, nxtsmlft);

        for (int i = 0; i < arr.length; i++) {
            int curr = (nxtsmrht[i]-nxtsmlft[i]-1) * arr[i];
            max = Math.max(curr, max);
        }
        return max;
    }
    
    public static void main(String[] args) {
        int[] arr = {2,1,2,3,5,6};
        System.out.println(maxareahis(arr));
    }
    
}
