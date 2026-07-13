
public class lastOccurenceorelement {
    // public static int lastOccurence(int[] arr, int i, int key) {
    //     if (i == -1) {
    //         return -1;
    //     }
    //     if (arr[i] == key) {
    //         return i;
    //     }
    //     return lastOccurence(arr, i - 1, key);
    // }
    public static int lastOccurence(int[] arr, int i, int key){
        if(i == arr.length){
            return -1;
        }
        System.out.println(i);
        lastOccurence(arr, i+1, key);
        if(arr[i] == key){
            return i;
        }
        System.out.println(i);
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {8, 3, 6, 9, 5, 10, 2, 5, 3};
        System.out.println("main " +lastOccurence(arr, 0, 5));
    }
}
