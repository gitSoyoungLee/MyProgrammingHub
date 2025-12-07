import java.util.*;
import java.io.*;

public class Main {
    static class Lesson {
        int due;
        int pay;
        public Lesson(int due, int pay) {
            this.due = due;
            this.pay = pay;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 금액이 큰 것부터 강연하되, 같은 금액에 대해서는 기간이 큰 것이 우선
        PriorityQueue<Lesson> queue = new PriorityQueue<>(new Comparator<Lesson>() {
            @Override
            public int compare(Lesson u1, Lesson u2) {
                if(u1.pay == u2.pay) {
                    return u2.due - u1.due;
                } else return u2.pay - u1.pay;
            }
        });

        int total = Integer.parseInt(br.readLine());
        int days = 0;
        for(int i=0; i<total; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int pay = Integer.parseInt(st.nextToken());
            int due = Integer.parseInt(st.nextToken());
            queue.offer(new Lesson(due, pay));
            days = Math.max(days, due);
        }

        // 강연 일정 확인
        boolean[] schedule = new boolean[days+1];
        int result = 0;
        while(!queue.isEmpty()) {
            Lesson lesson = queue.poll();
            int idx = lesson.due;
            for(int i = idx; i > 0; i--) {
                if(!schedule[i]) {
                    schedule[i] = true;
                    result += lesson.pay;
                    break;
                }
            }
        }

        System.out.println(result);
    }
}