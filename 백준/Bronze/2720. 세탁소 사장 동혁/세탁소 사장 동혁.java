import java.util.*;
import java.io.*;

public class Main {
    static int quarter = 25;
    static int dime = 10;
    static int nickel = 5;
    static int penny = 1;
    
    static String solve(int change) {
        int quarters = change / quarter;
        change -= quarters * quarter;
        int dimes = change / dime;
        change -= dimes * dime;
        int nickels = change / nickel;
        change -= nickels * nickel;
        int pennies = change;
        
        StringBuilder sb = new StringBuilder();
        sb.append(quarters).append(" ")
            .append(dimes).append(" ")
            .append(nickels).append(" ")
            .append(pennies).append("\n");
        
        return sb.toString();

    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int testcase = Integer.parseInt(br.readLine());
        
        for(int i=0; i<testcase; i++) {
            int change = Integer.parseInt(br.readLine());
            sb.append(solve(change));
        }
        
        System.out.println(sb);
    }
}