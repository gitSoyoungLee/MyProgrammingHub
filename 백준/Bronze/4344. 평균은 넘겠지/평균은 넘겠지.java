import java.util.*;
import java.io.*;
import java.lang.Math;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 테스트 케이스 개수
        int testcase = Integer.parseInt(br.readLine());
        
        for(int i=0; i<testcase; i++) {
            // 학생들 점수 읽고 평균 구하기
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] scores = new int[Integer.parseInt(st.nextToken())];
            for(int j=0; j<scores.length; j++)
                scores[j] = Integer.parseInt(st.nextToken());
            bw.write(rateAboveAvg(scores));
            bw.newLine();
        }
        
        bw.flush();
    }
    
    public static String rateAboveAvg(int[] arr) {
        double avg = calculateAvg(arr);
        int sumAboveAvg = 0;
        for(int num : arr) {
            if(num > avg) sumAboveAvg++;
        }
        
        double rate =  (double)sumAboveAvg / (double)arr.length * 100.0;
        return String.format("%.3f%%", rate);
    }
    
    public static double calculateAvg(int[] arr) {
        int sum = 0;
        for(int num : arr) 
            sum+= num;
        return sum / (double) arr.length;
    }
    
    
}