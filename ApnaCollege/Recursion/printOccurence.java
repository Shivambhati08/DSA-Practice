public class printOccurence {
    public static void printOccur(int[] arr, int idx, int key){
        if(idx == arr.length){
            return;
        }
        if(arr[idx] == key){
            System.out.print(idx+" ");
        }
        printOccur(arr, idx+1, key);
    }
    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        int key = 2;
        printOccur(arr, 0, key);
    }
}
