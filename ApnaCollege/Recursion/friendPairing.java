
public class friendPairing {
    public static int friendWAys(int n){
        if(n == 1 || n == 2){
            return n;
        }
        return friendWAys(n-1) + (n-1)*friendWAys(n-2);
    }
    public static void main(String[] args) {
        System.out.println(friendWAys(4));
    }
}
