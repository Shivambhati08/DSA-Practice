public class gridwaysshort {
    public static int fact(int n){
        if(n == 0){
            return 1;
        }
        return n*fact(n-1);
    }
    public static void main(String[] args) {
        int n = 4;
        int m = 4;
        System.out.println(fact(n-1+m-1)/(fact(n-1)*fact(m-1)));
    }
}
