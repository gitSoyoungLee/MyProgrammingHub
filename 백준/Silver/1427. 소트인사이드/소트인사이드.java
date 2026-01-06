import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] str = br.readLine().toCharArray();

        Arrays.sort(str);

        StringBuilder sb = new StringBuilder();
        for(char c : str)
            sb.append(c);

        sb.reverse();

        System.out.println(sb);
    }
}