import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int size = Integer.parseInt(br.readLine());
        
        int[] arr = new int[size];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<size; i++) {
            arr[i] = Integer.parseInt(st.nextToken());    
        }
        
        Arrays.sort(arr);
        
        int sum = 0;
        int prev = 0;
        for(int i=0; i<size; i++) {
            prev += arr[i];
            sum += prev;
        }
        
        System.out.println(sum);
    }
}