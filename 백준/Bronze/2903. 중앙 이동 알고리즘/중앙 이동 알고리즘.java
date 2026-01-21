import java.util.*;
import java.lang.Math;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        // 점이 3, 5, 9, .. (2의 n제곱 +1)로 증가
        System.out.println((int)Math.pow(Math.pow(2, n)+1, 2));
    }
}