import java.io.*;

public class Main{
    public static void main(String[] args){
        try{
            // BufferedReader, Writer 선언
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            // 테스트 케이스의 개수 입력
            int t = Integer.parseInt(br.readLine());

            // 모든 테스트케이스에 대하여 반복
            for(int i = 0; i < t; i++){
                String str=br.readLine();
                // 띄어쓰기를 기준으로 A와 B 분리
                int idx = str.indexOf(' ');
                int a = Integer.parseInt(str.substring(0,idx));
                int b = Integer.parseInt(str.substring(1+idx,str.length()));
                // 연산과 저장
                bw.write((a+b)+""); // int를 문자열로 바꾸어 저장
                bw.newLine();
            }
            
            // 한 번에 출력
            bw.flush();
            bw.close();
            
        } catch(IOException e){
            e.printStackTrace();
        }

    }
}