import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String expression = br.readLine();

        StringTokenizer st = new StringTokenizer(expression, "-");

        int result = 0;

        List<Integer> list = new ArrayList<>();
        StringTokenizer st1 = new StringTokenizer(st.nextToken(), "+");
        while(st1.hasMoreTokens())
            result += Integer.parseInt(st1.nextToken());

        while(st.hasMoreTokens()) {
            st1 = new StringTokenizer(st.nextToken(), "+");
            int temp = 0;
            while(st1.hasMoreTokens()) {
                temp += Integer.parseInt(st1.nextToken());
            }
            result -= temp;
        }

        System.out.println(result);
    }
}