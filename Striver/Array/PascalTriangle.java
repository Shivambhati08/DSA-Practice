public class PascalTriangle{

    // 1. Generate a single element at a place

    public static long fNc(int n, int r){
        r = Math.min(r, n-r);
        long res = 1;
        for(int i = 0; i < r; i++){
            res = res * (n-i);
            res = res/ (i + 1);
        }
        return res;
    }

    // 2. Generate a row of pascal Triangle

    public static void pascalrow(int n){
        int ans = 1;
        System.out.print(ans+" ");
        for (int i = 0; i < n; i++) {
            ans = (ans * (n-i))/ (i + 1);
            System.out.print(ans+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int r = 5;
    //    System.out.println(fNc(r, c))

    for (int i = 0; i < r; i++) {
        pascalrow(i);
    }
    }
}