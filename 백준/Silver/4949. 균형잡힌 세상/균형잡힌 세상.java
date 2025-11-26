import java.util.*;
import java.io.*;

public class Main {
  static boolean isBalanced(String s) {
    Stack<String> stack = new Stack<>();
    for(char c : s.toCharArray()) {
      if(c=='(') stack.push("(");
      if(c==')') {
        if(!stack.isEmpty() && stack.peek().equals("("))
          stack.pop();
        else return false;
      }

      if(c=='[') stack.push("[");
      if(c==']') {
        if(!stack.isEmpty() && stack.peek().equals("["))
          stack.pop();
        else return false;
      }
    }
    return stack.isEmpty();
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    StringBuilder sb = new StringBuilder();

    while(true) {
      String s = br.readLine();
      if(s.equals(".")) break;
      if(isBalanced(s)) sb.append("yes\n");
      else sb.append("no\n");
    }

    System.out.println(sb.toString());

  }
}