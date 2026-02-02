import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        String str;
        StringTokenizer st;
        while(true){
            str = br.readLine();
            if(str.equals("0 0")) break;
            st = new StringTokenizer(str);
            
            int sum = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
            sb.append(sum).append("\n");
        }
        
        System.out.println(sb);
    }
}