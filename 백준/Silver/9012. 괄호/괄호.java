import java.util.*;
import java.io.*;

public class Main {
  static boolean isVPS(String str) {
    Stack<Integer> stack = new Stack<>();

    for(char c : str.toCharArray()) {
      if(c == '(') stack.push(1);
      if(c == ')') {
        try {
          stack.pop();
        } catch (EmptyStackException E) {
          return false;
        } catch (Exception e) {
          break;
        }
      }
    }

    return stack.isEmpty();

  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int testcase = Integer.parseInt(br.readLine());
    for(int i=0; i<testcase; i++) {
      String str = br.readLine();
      if(isVPS(str)) bw.write("YES");
      else bw.write("NO");
      bw.newLine();
    }

    bw.flush();
  }
}