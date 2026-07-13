public class gridways {
    // public static int grid(int i, int j, int row, int col){
    //    if(i == row-1 && j == col-1){
    //     return 1;
    //    }
    //    else if(i == row || j == col){
    //     return 0;
    //    }
    //    int w1 = grid(i+1, j, row, col);
    //    int w2 = grid(i, j+1, row, col);
    //    return w1+w2;
    // }
    // public static void main(String[] args) {
    //     System.out.println(grid(0, 0, 15, 15));
    // }
    public static int  gridways(int i, int j, int row, int col){
        if(i == row-1 && j == col-1){
            return 1;
        }
        else if(i >= row || j >= col){
            return 0;
        }
        return gridways(i+1, j, row, col)+gridways(i, j+1, row, col);
    }
    public static void main(String[] args) {
        System.out.println(gridways(0, 0, 2, 2));
    }
}
