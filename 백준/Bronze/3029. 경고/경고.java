import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), ":");
        
        int currHour = Integer.parseInt(st.nextToken());
        int currMin = Integer.parseInt(st.nextToken());
        int currSec = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine(), ":");
        
        int goalHour = Integer.parseInt(st.nextToken());
        int goalMin = Integer.parseInt(st.nextToken());
        int goalSec = Integer.parseInt(st.nextToken());
        
        int hour = goalHour - currHour;
        int min = goalMin - currMin;
        int sec = goalSec - currSec;
        
        StringBuilder sb = new StringBuilder();
        
        if(sec <0) {
            sec+=60;
            min--;
        }
        if(min<0) {
            min+=60;
            hour--;
        }
        if(hour<0) {
            hour+=24;
        }
        
        if(hour == 0 && min == 0 && sec == 0){
            sb.append("24:00:00");
            System.out.println(sb);
            return;
        }
        
        if(hour > 10) {
            sb.append(String.valueOf(hour)).append(":");
        } else {
            sb.append("0").append(String.valueOf(hour)).append(":");
        }
        
        if(min > 10) {
            sb.append(String.valueOf(min)).append(":");
        }  else {
            sb.append("0").append(String.valueOf(min)).append(":");
        }
        
        if(sec > 10) {
            sb.append(String.valueOf(sec));
        } else {
            sb.append("0").append(String.valueOf(sec));
        }
        
        System.out.println(sb);
    }
}