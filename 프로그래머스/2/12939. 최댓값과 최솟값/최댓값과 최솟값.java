import java.util.*;
import java.io.*;
import java.lang.Math;

class Solution {
    public String solution(String s) throws IOException {
        StringBuilder sb = new StringBuilder();
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(s);
        
        
        int min = Integer.parseInt(st.nextToken());
        int max = min;
        
        int total = st.countTokens();
        
        for(int i=0; i<total; i++) {
            int num = Integer.parseInt(st.nextToken());
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        
        sb.append(String.valueOf(min));
        sb.append(" " + max);
        
        return sb.toString();
    }
}