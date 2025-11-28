import java.io.*;
import java.util.*;
import java.lang.Math;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int total = Integer.parseInt(st.nextToken());
        int period = Integer.parseInt(st.nextToken());
        
        int[] visitors = new int[total];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<total; i++)
            visitors[i] = Integer.parseInt(st.nextToken());
        
        int sum = 0;
        for(int i=0; i<period; i++)
            sum += visitors[i];
        
        int max = sum;
        int count = 1;
        
        for(int i=period; i<total; i++) {
            sum += visitors[i] - visitors[i-period];
            if(sum == max) count++;
            else if(sum > max) {
                max = sum;
                count = 1;
            }
        }
        
        if(max == 0)
            System.out.println("SAD");
        else {
            System.out.println(max);
            System.out.println(count);
        }
    }
}