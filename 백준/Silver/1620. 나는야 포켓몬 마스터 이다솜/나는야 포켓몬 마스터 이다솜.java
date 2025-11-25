import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int all = Integer.parseInt(st.nextToken());    // 도감에 수록된 포켓몬 수
    int goal = Integer.parseInt(st.nextToken());    // 맞춰야 하는 문제 수

    // 1~N(all)번까지 도감 수록
    HashMap<String, String> dictionary = new HashMap<>();
    for(int i=1; i<=all; i++) {
      String name = br.readLine();
      dictionary.put(String.valueOf(i), name);
      dictionary.put(name, String.valueOf(i));
    }

    // 문제 맞추기
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    for(int i=0; i<goal; i++) {
      String problem = br.readLine();
      bw.write(dictionary.get(problem));
      bw.newLine();
    }

    bw.flush();

  }
}