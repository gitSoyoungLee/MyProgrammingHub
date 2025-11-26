import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int total = Integer.parseInt(br.readLine());

    int[][] arr = new int[total][2];
    for(int i=0; i<total; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      arr[i][0] = Integer.parseInt(st.nextToken());
      arr[i][1] = Integer.parseInt(st.nextToken());
    }
    
    Arrays.sort(arr, (e1, e2) -> {
      if(e1[0] == e2[0]) {
        return e1[1] - e2[1]; 
      } else return e1[0] - e2[0];
    });

    StringBuilder sb = new StringBuilder();
    for(int i=0; i<total; i++) {
      sb.append(arr[i][0] + " " + arr[i][1] + "\n");
    }

    System.out.println(sb.toString());
  }
}