import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    HashMap<Integer, Integer> map = new HashMap<>();

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int cards = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());
    for(int i=0; i<cards; i++) {
      int num = Integer.parseInt(st.nextToken());
      if(map.containsKey(num))
        map.put(num, map.get(num) + 1);
      else
        map.put(num, 1);
    }

    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int testcase = Integer.parseInt(br.readLine());
    st = new StringTokenizer(br.readLine());
    for(int i=0; i<testcase; i++) {
      int num = Integer.parseInt(st.nextToken());
      if(map.containsKey(num)) bw.write(map.get(num)+" ");
      else bw.write("0 ");
    }

    bw.flush();
  }
}