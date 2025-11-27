import java.util.*;
import java.io.*;

public class Main {
  static Deque<Integer> deque = new ArrayDeque<>();
  static StringBuilder sb = new StringBuilder();

  public static void solve(String str) {
    StringTokenizer st = new StringTokenizer(str);
    String cmd = st.nextToken();

    if(cmd.equals("push_front")) {
      deque.offerFirst(Integer.parseInt(st.nextToken()));
    }
    if(cmd.equals("push_back")) {
      deque.offerLast(Integer.parseInt(st.nextToken()));
    }
    if(cmd.equals("pop_front")) {
      if(deque.isEmpty()) sb.append("-1\n");
      else sb.append(deque.pollFirst()).append("\n");
    }
    if(cmd.equals("pop_back")) {
      if(deque.isEmpty()) sb.append("-1\n");
      else sb.append(deque.pollLast()).append("\n");
    }
    if(cmd.equals("size")) {
      sb.append(deque.size()).append("\n");
    }
    if(cmd.equals("empty")) {
      if(deque.isEmpty())
        sb.append("1\n");
      else sb.append("0\n");
    }
    if(cmd.equals("front")) {
      if(deque.isEmpty()) sb.append("-1\n");
      else sb.append(deque.peekFirst()).append("\n");
    }
    if(cmd.equals("back")) {
      if(deque.isEmpty()) sb.append("-1\n");
      else sb.append(deque.peekLast()).append("\n");
    }
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int total = Integer.parseInt(br.readLine());

    for(int i=0; i<total; i++) {
      solve(br.readLine());
    }

    System.out.println(sb.toString());
  }
}