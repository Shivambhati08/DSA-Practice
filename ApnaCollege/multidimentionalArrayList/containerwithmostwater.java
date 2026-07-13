public class containerwithmostwater {
    public static void main(String[] args) {
        int[] arr = {1, 5, 4, 3};

        int left = 0;
        int right = arr.length - 1;

        int water = 0;
        while(left < right){
            int height = Math.min(arr[left], arr[right]);
            int width = right - left;

            int currwater = height * width;
            water = Math.max(water, currwater);

            if(arr[left] < arr[right]){
                left++;
            }
            else{
                right--;
            }
        }
        System.out.println(water);
    }
}
