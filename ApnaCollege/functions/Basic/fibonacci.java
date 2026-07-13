public class fibonacci{
    public static void main(String[] args){
        int n = 5;
        int first = 0;
        int second = 1;
        for (int i = 0; i < n; i++) {
            int temp = second;
            second = second + first;
            first = temp;

        }
        System.out.println(first);
    }
}