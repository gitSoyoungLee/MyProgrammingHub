import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    int[] all = new int[9];
    int sum = 0;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    for(int i=0; i<9; i++) {
      all[i] = Integer.parseInt(br.readLine());
      sum += all[i];
    }

    Arrays.sort(all);

    int diff = sum - 100;    // 현재 아홉 난쟁이 키의 합은 100과 얼마나 차이나는가
    // 더해서 diff가 되는 두 명의 난쟁이 찾기
    int left = 0;
    int right = 8;
    while(all[left] + all[right] != diff) {
      if(all[left] + all[right] < diff)
        left++;
      else
        right--;
    }

    // 일곱 난쟁이 출력
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    for(int i=0; i<9; i++) {
      if(i!=left && i!=right) {
        bw.write(String.valueOf(all[i]));
        bw.newLine();
      }
    }

    bw.flush();
  }
}