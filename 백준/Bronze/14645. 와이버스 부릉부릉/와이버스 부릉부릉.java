import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        
        String str;
        for(int i=0; i<n; i++) {
            str = br.readLine();
        }
        
        System.out.println("비와이");
        
    }
}