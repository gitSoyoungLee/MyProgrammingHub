import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int total = Integer.parseInt(br.readLine());
        
        int[][] arr = new int[total][2];
        
        StringTokenizer st;
        for(int i=0; i<total; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
        
        // 본인보다 덩치가 큰 사람의 수 구하기
        int[] score = new int[total];
        for(int i=0; i<total; i++) {
            int count = 0;
            for(int j=0; j<total; j++) {
                if(i==j) continue;
                if(arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1])
                    count++;
            }
            score[i] = count;
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<total-1; i++) {
            sb.append(score[i]+1).append(" ");
        }
        sb.append(score[total-1]+1);
        
        System.out.println(sb);
    }
}