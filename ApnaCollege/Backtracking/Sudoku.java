
public class Sudoku {
    public static boolean isSafe(int[][] arr, int row, int col, int key){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i][col] == key){
                return false;
            }
        }
        for(int j = 0; j < arr[0].length; j++){
            if(arr[row][j] == key){
                return false;
            }
        }
        int sr = (row/3)*3;
        int sc = (col/3)*3;
        for (int i = sr; i < sr+3; i++) {
            for (int j = sc; j < sc+3; j++) {
                if(arr[i][j] == key){
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean fillsudoku(int[][] arr, int row, int col){
        if(row == arr.length){
            return true;
        }
        
        int newrow = row;
        int newcol = col + 1;
        if(col + 1 == 9){
            newrow = row + 1;
            newcol = 0;
        }
        if(arr[row][col] != 0){
            return fillsudoku(arr, newrow, newcol);
        }
        for (int digit = 1; digit <= 9; digit++) {
            if(isSafe(arr, row, col, digit)){
                arr[row][col] = digit;
                if(fillsudoku(arr, newrow, newcol)){
                    return true;
                }
            }
            arr[row][col] = 0;
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] sudoku = {
            {5, 3, 0, 0, 7, 0, 0, 0, 0},
            {6, 0, 0, 1, 9, 5, 0, 0, 0},
            {0, 9, 8, 0, 0, 0, 0, 6, 0},
            {8, 0, 0, 0, 6, 0, 0, 0, 3},
            {4, 0, 0, 8, 0, 3, 0, 0, 1},
            {7, 0, 0, 0, 2, 0, 0, 0, 6},
            {0, 6, 0, 0, 0, 0, 2, 8, 0},
            {0, 0, 0, 4, 1, 9, 0, 0, 5},
            {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };
        fillsudoku(sudoku, 0, 0);
        for (int i = 0; i < sudoku.length; i++) {
            for (int j = 0; j < sudoku[0].length; j++) {
                System.out.print(sudoku[i][j]+" ");
            }
            System.out.println();
        }
    }
}
