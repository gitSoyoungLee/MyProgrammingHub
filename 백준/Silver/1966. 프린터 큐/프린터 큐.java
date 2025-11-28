import java.util.*;
import java.io.*;
import java.util.stream.Collectors;

public class Main {

    static boolean isFrontMostImportant(Queue<Integer> queue) {
        int max = queue.stream()
            .sorted(Comparator.reverseOrder())
            .collect(Collectors.toList())
            .get(0);
        return queue.peek() == max;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testcase = Integer.parseInt(br.readLine());

        StringTokenizer st;

        for(int i=0; i<testcase; i++) {
            int count = 0; // 출력 순서 = 출력된 양
            // 초기 입력
            Queue<Integer> importances = new LinkedList<>();
            Queue<Integer> docs = new LinkedList<>();

            st = new StringTokenizer(br.readLine());
            int total = Integer.parseInt(st.nextToken());
            int target = Integer.parseInt(st.nextToken());
            for(int j=0; j<total; j++) {
                docs.offer(j);
            }

            st = new StringTokenizer(br.readLine());
            for(int j=0; j<total; j++)
                importances.offer(Integer.parseInt(st.nextToken()));

            while(true) {
                if(isFrontMostImportant(importances)) {
                    importances.poll();
                    int printed = docs.poll();
                    count++;
                    if(printed == target) break;
                } else {
                    importances.offer(importances.poll());
                    docs.offer(docs.poll());
                }
            }
            bw.write(String.valueOf(count));
            bw.newLine();
        }
        bw.flush();
    }
}