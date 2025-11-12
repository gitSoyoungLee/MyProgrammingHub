import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // 초기 입력
    Scanner sc = new Scanner(System.in);

    int total_papers = sc.nextInt();
    int target_papers = sc.nextInt();
    int[] papers = new int[total_papers];

    for (int i = 0; i < total_papers; i++) {
      int moloco_price = sc.nextInt();
      int max_price = sc.nextInt();
      papers[i] = Math.max(0,max_price - moloco_price);  // MOLOCO의 입찰가 - 다른 최고 입찰가 = 즉, 입찰 되기 위해 필요한 추가금
    }

    if (target_papers == 0) {
      System.out.println(0);
      return;
    }

    Arrays.sort(papers);

    System.out.println(papers[target_papers-1]);

  }
}