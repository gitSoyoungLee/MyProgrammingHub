import java.util.*;
import java.io.*;
import java.lang.Math;

public class Main {
    static PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            if(Math.abs(o1) == Math.abs(o2)) {
                return o1-o2;
            } else return Math.abs(o1) - Math.abs(o2);
        }
    });

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int total = Integer.parseInt(br.readLine());

        for(int i=0; i<total; i++) {
            int n = Integer.parseInt(br.readLine());
            if(n == 0) {
                if(priorityQueue.isEmpty())
                    sb.append("0\n");
                else
                    sb.append(priorityQueue.poll()).append("\n");
            } else priorityQueue.offer(n);
        }

        System.out.println(sb);
    }
}