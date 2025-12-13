import java.util.*;
import java.io.*;
import java.lang.Math;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;
    
    public static void solve(int a, int b) {
        if(a > b) {
            if(a%b==0) {
                sb.append("multiple\n");
                return;
            } 
        } else if (a < b) {
            if(b%a==0) { 
                sb.append("factor\n");
                return; 
            }
        }
        sb.append("neither\n");
    }
    
    public static void main(String[] args) throws IOException {
        
        String str = br.readLine();
        
        while(!str.equals("0 0")) {
            st = new StringTokenizer(str);
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            solve(a, b);
            str = br.readLine();
        }
        
        System.out.println(sb);
    }
}