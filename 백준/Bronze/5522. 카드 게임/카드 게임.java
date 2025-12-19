import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        int sum = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        for(int i=0; i<5; i++) {
         sum += Integer.parseInt(br.readLine());    
        }
        System.out.println(sum);
    } 
}