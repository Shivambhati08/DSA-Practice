import java.util.Scanner;

public class shortestpath{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int y = 0; 
        int x = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == 'N'){
                y++;
            }
            else if(ch == 'S') {
                y--;
            }
            else if(ch == 'E'){
                x++;
            }
            else if(ch == 'W'){
                x--;
            }
        }
        double result = Math.sqrt(x*x + y*y);
        System.out.println(result);
        sc.close();
    }
}