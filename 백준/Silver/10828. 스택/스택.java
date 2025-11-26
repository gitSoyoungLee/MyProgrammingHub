import java.util.*;
import java.io.*;

public class Main {
  static Stack<Integer> stack = new Stack<>();
  static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

  static void push(int i) {
    stack.push(i);
  }

  static void pop() throws IOException {
    if(stack.isEmpty()) bw.write(String.valueOf(-1));
    else bw.write(String.valueOf(stack.pop()));
    bw.newLine();
  }

  static void size() throws IOException {
    bw.write(String.valueOf(stack.size()));
    bw.newLine();
  }

  static void empty() throws IOException {
    if(stack.isEmpty())
      bw.write(String.valueOf(1));
    else
      bw.write(String.valueOf(0));
    bw.newLine();
  }

  static void top() throws IOException {
    if(stack.isEmpty()) bw.write(String.valueOf(-1));
    else bw.write(String.valueOf(stack.peek()));
    bw.newLine();
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());

    for(int i=0; i<n; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      String cmd = st.nextToken();

      switch(cmd) {
        case "push" :
          push(Integer.parseInt(st.nextToken()));
          break;
        case "pop" :
          pop();
          break;
        case "size" :
          size();
          break;
        case "empty" :
          empty();
          break;
        case "top" :
          top();
          break;
        default :
          break;
      }
    }

    bw.flush();
  }
}