import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int count = 1;
        int num = 666;
        while(count < n) {
            num++;
            String name = String.valueOf(num);
            if(name.contains("666")) count++;
        }
        System.out.println(num);
    }
}