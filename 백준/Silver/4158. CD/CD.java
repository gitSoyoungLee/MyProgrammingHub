import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();
        while(!str.equals("0 0")) {
            StringTokenizer st = new StringTokenizer(str);
            long sanggeunCD = Long.parseLong(st.nextToken());
            long sunyoungCD = Long.parseLong(st.nextToken());

            long count = 0;
            HashSet<Long> cd = new HashSet<>();
            for(long i=0; i<sanggeunCD; i++)
                cd.add(Long.parseLong(br.readLine()));

            for(long i=0; i<sunyoungCD; i++) {
                if(cd.contains(Long.parseLong(br.readLine()))) count++;
            }

            sb.append(count).append("\n");
            str = br.readLine();
        }

        System.out.println(sb.toString());
    }
}