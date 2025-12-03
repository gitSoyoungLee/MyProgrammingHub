import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int total = Integer.parseInt(br.readLine());

        List<Long> original = new ArrayList<>();
        List<Long> sorted = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < total; i++) {
            long n = Long.parseLong(st.nextToken());
            sorted.add(n);
            original.add(n);
        }
        Collections.sort(sorted);

        Map<Long, Integer> map = new HashMap<>();

        int idx = 0;
        for (long v : sorted) {
            if (!map.containsKey(v)) {
                map.put(v, idx++);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (long n : original) {
            sb.append(map.get(n)).append(" ");
        }

        System.out.println(sb);

    }
}