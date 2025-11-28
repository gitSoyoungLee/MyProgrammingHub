import java.util.*;
import java.io.*;
import java.lang.Math;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int days = Integer.parseInt(st.nextToken());
        int period = Integer.parseInt(st.nextToken());

        int[] tempuratures = new int[days];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<days; i++)
            tempuratures[i] = Integer.parseInt(st.nextToken());

        int sum = 0;
        for(int i=0; i<period; i++) {
            sum += tempuratures[i];
        }
        
        int max = sum;
        
        for(int i=period; i<days; i++) {
            sum += tempuratures[i] - tempuratures[i-period];
            max = Math.max(max, sum);
        }

        System.out.println(max);
    }
}