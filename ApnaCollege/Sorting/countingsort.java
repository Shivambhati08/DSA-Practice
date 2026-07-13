
public class countingsort {

    public static void main(String[] args) {
        int[] arr = {9, 7, 8, 3, 1};
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }
        int[] freq = new int[largest + 1];
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }

        int j = 0;
        for (int i = 0; i < freq.length; i++) {
            while (freq[i] > 0) {
                arr[j] = i;
                j++;
                freq[i]--;
            }
        }
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
