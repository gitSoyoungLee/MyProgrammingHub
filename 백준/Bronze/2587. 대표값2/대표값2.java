import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int[] arr = new int[5];
        int sum = 0;
        for(int i=0; i<5; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }
        
        Arrays.sort(arr);
        
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(sum/5));
        bw.newLine();
        bw.write(String.valueOf(arr[2]));
        bw.flush();
        
    }
}