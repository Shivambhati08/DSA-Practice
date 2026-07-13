public class Nqueeninrow {
    public static void nqueen(char[][] arr, int row){
        if(row == arr.length){
            System.out.println("---------------------------------");
            for(int i = 0; i < arr.length; i++){
                for (int j = 0; j < arr[0].length; j++) {
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
            return;
        }
        for (int j = 0; j < arr.length; j++) {
            arr[row][j] = 'Q';
            nqueen(arr, row+1);
            arr[row][j] = 'X';
        }
    }
    public static void main(String[] args) {
        int n = 2;
        char[][] arr = new char[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = 'X';    
            }
        }
        nqueen(arr, 0);
        
    }
}
