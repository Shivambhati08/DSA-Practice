
public class searchinsortedmatrix {
    public static void main(String[] args) {
        int[][] arr = {
            {10,20,30,40},
            {15,25,35,45},
            {27,29,37,48},
            {32,33,39,50},
        };
        int key = 37;

        int n = arr.length;
        int m = arr[0].length;
        int i = 0;
        int j = m-1;
        while(i < n && j >= 0){
            if(arr[i][j] == key){
                System.out.print("("+i+","+j+")");
                return;
            }
            else if(arr[i][j] < key){
                i++;
            }
            else {
                j--;
            }
        }
        System.out.println("Key not found");
    }
}
