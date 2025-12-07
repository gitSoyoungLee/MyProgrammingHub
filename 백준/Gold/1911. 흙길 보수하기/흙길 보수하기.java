import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int total = Integer.parseInt(st.nextToken());    // 웅덩이의 개수
        int length = Integer.parseInt(st.nextToken());    // 널판지의 길이

        int bridge = 0;    // 널판지 끝이 있는 좌표 = 널판지로 다리가 어디까지 완성됐는가

        int[][] holls = new int[total][2];
        for(int i=0; i<total; i++) {
            st = new StringTokenizer(br.readLine());
            holls[i][0] = Integer.parseInt(st.nextToken());
            holls[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(holls, Comparator.comparingInt(a -> a[0]));

        int count = 0;

        for(int i=0; i<holls.length; i++) {
            if(bridge < holls[i][0]) {
                bridge = holls[i][0];
            }
            int num = (holls[i][1] - bridge) / length;
            if((holls[i][1] - bridge) % length > 0) num++;
            bridge += num * length;
            count += num;
        }

        System.out.println(count);
    }
}