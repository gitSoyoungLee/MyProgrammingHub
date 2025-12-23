import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int sum = 0;
        for(int i=0; i<4; i++)
            sum += Integer.parseInt(st.nextToken());
        
        int goal = Integer.parseInt(st.nextToken());
        
        if(sum >= goal*4) {
            System.out.println(0);
            return;
        }
        
        System.out.println(goal*4-sum);
    }
}