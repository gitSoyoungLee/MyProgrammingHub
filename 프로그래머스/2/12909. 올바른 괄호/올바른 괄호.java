import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;

        Stack<Integer> stack = new Stack<>();
        
        char[] charArray = s.toCharArray();
        if(charArray[0]==')') return false;
        
        for(char c:charArray) {
            if(c=='(') {
                stack.push(1);
            } else if(c==')'&&stack.size()>0){
                stack.pop();
            }
        }

        if(stack.size() != 0) answer = false;
        return answer;
    }
}