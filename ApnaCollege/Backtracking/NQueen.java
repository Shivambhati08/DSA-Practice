
public class NQueen {

    public static boolean isSafe(char[][] arr, int row, int col) {
        for (int i = row - 1; i >= 0; i--) {
            if (arr[i][col] == 'Q') {
                return false;
            }
        }
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (arr[i][j] == 'Q') {
                return false;
            }
        }
        for (int i = row - 1, j = col + 1; i >= 0 && j < arr[0].length; i--, j++) {
            if (arr[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    public static void nqueen(char[][] arr, int row) {
        if(row == arr.length){
            System.out.println("----------------------------------");
           for (int i = 0; i < arr.length; i++) {
               for (int j = 0; j < arr.length; j++) {
                   System.out.print(arr[i][j]+" ");
               }
               System.out.println();
           }
           return;
        }
        for (int j = 0; j < arr.length; j++) {
            if(isSafe(arr, row, j) == true){
                arr[row][j] = 'Q';
                nqueen(arr, row+1);
                arr[row][j] = 'X';
            }
        }
    }

    public static void main(String[] args) {
        int n = 5;
        char[][] arr = new char[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
               arr[i][j] = 'X';
            }
        }
        nqueen(arr, 0);
    }
}
