import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int size = Integer.parseInt(br.readLine());
    int[] arr = new int[size];

    StringTokenizer st = new StringTokenizer(br.readLine());
    for(int i=0; i<size; i++)
      arr[i] = Integer.parseInt(st.nextToken());

    int goal = Integer.parseInt(br.readLine());

    Arrays.sort(arr);
    int count = 0;
    int left = 0;
    int right = size - 1;
    while(left < right) {
      int sum = arr[left] + arr[right];
      if(sum == goal) {
        count++;
        left++;
        right--;
      }
      else if(sum < goal) left++;
      else right--;
    }

    System.out.println(count);

  }
}