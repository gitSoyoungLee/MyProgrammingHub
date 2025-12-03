import java.util.*;
import java.io.*;

public class Main {
    /*
     * wires의 전선들에서 길이가 length인 전선들을 최대 몇 개 만들 수 있는가?
     */
    static long cutWires(int[] wires, long length) {
        long result = 0;
        for(int wire : wires) {
            result += wire/length;
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int current = Integer.parseInt(st.nextToken());    // 이미 가지고 있는 랜선 수
        int goal =  Integer.parseInt(st.nextToken());    // 필요한 랜선의 개수

        int[] initialWires = new int[current];
        for(int i=0; i<current; i++) {
            initialWires[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(initialWires);

        long low = 1;
        long high = initialWires[current-1];
        long mid = (low+high)/2;
        long answer = low;
        while(low <= high) {
            long wires = cutWires(initialWires, mid);
            if(wires >= goal) {
                answer = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
            mid = (high + low) / 2;
        }

        System.out.println(answer);

    }
}