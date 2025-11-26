import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int total = Integer.parseInt(br.readLine());
        
        Stack<Integer> stack = new Stack<>();
        
        for(int i=0; i<total; i++) {
            int num = Integer.parseInt(br.readLine());
            if(num == 0) stack.pop();
            else stack.push(num);
        }
        
        int sum = 0;
        while(!stack.isEmpty()){
            sum += stack.pop();
        }
        
        System.out.println(sum);
    }
}
