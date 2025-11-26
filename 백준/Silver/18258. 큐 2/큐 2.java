import java.util.*;
import java.io.*;

public class Main {
  static LinkedList<String> queue = new LinkedList<>();

  static String solve(String s) {

    if(s.startsWith("push")) {
      StringTokenizer st = new StringTokenizer(s);
      String cmd = st.nextToken();
      queue.offer(st.nextToken());
      return "";
    }

    if(s.equals("pop")) {
      if(queue.isEmpty()) return "-1\n";
      else return queue.poll() + "\n";
    }

    if(s.equals("size")) {
      return queue.size()+"\n";
    }

    if(s.equals("empty")) {
      return queue.isEmpty()? "1\n" : "0\n";
    }

    if(s.equals("front")) {
      if(queue.isEmpty()) return "-1\n";
      return queue.peek() + "\n";
    }

    if(s.equals("back")) {
      if(queue.isEmpty()) return "-1\n";
      return queue.peekLast() + "\n";
    }

    return "";
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    StringBuilder sb = new StringBuilder();

    int testcase = Integer.parseInt(br.readLine());
    for(int i=0; i<testcase; i++) {
      sb.append(solve(br.readLine()));
    }

    System.out.println(sb.toString());

  }

}