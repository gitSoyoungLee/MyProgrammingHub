import java.util.*;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String n = sc.next();
        int b = sc.nextInt();
        
        int answer = 0;
        for(int i=0; i<n.length(); i++) {
            char c = n.charAt(i);
            
            int num;
            if('A' <= c && c <= 'Z') {
                num = (int) c - 65 + 10;
            } else num = c- '0';
            
            int curr = (int) Math.pow(b, n.length()-i-1) * num;
            answer+=curr;
        }
        
        System.out.println(answer);
        
    }
}