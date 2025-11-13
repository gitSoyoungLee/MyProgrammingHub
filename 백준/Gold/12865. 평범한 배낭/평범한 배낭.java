import java.util.*;
import java.lang.Math;

public class Main {
  public static void main(String[] args) {
    // 초기 입력
    Scanner sc = new Scanner(System.in);
    int itemNumbers = sc.nextInt();
    int maxWeight = sc.nextInt();
    int[] itemWeights = new int[itemNumbers];
    int[] itemValues = new int[itemNumbers];

    for(int i=0; i<itemNumbers; i++) {
      itemWeights[i] = sc.nextInt();
      itemValues[i] = sc.nextInt();
    }

    // dp 표 채우기
    int[][] dp = new int[itemNumbers][maxWeight+1];
    for(int w=0; w<maxWeight+1; w++) {
      for(int i=0; i<itemNumbers; i++) {
        if(itemWeights[i] <= w) {
          int unincludedValue = (i>=1)? dp[i-1][w]:0;;
          int includedValue = itemValues[i] + ((i>=1)? dp[i-1][w-itemWeights[i]]:0);
          dp[i][w] = Math.max(unincludedValue, includedValue);

        } else {
          dp[i][w] = (i>=1)? dp[i-1][w]:0;
        }
      }
    }
    System.out.println(dp[itemNumbers-1][maxWeight]);
  }
}