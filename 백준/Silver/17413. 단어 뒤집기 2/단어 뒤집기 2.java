import java.util.*;
import java.io.*;

public class Main {
    // 공백 기준으로 파싱
    // 글자 순서대로 스택에 넣기 -> 후입선출이므로 뒤집힘
    // "<"이면 flag = true -> 넣지 않기
    // ">"이면 flag = false -> 이후 글자는 스택에 넣기
    // "<"를 만났거나, flag=false이고 " "일 때 스택에 있는 것 다 꺼내기
    // 마지막엔 스택 다 꺼내기

    static StringBuilder sb = new StringBuilder();

    static Stack<Character> stack = new Stack<>();

    static void emptyStack() {
        while(!stack.isEmpty()) {
            sb.append(stack.pop());
        }
    }

    static void solve(String str) {
        boolean flag = false;

        for(char c : str.toCharArray()) {
            if(c=='<') {
                flag = true;
                emptyStack();
                sb.append("<");
            } else if (c == '>') {
                flag = false;
                sb.append(">");
            } else if(flag) {
                sb.append(c);
            } else if(!flag && c == ' ') {
                emptyStack();
                sb.append(" ");
            } else {
                stack.push(c);
            }
        }
        emptyStack();
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        solve(br.readLine());

        System.out.println(sb);

    }
}