import java.util.*;

public class Main {
  public static int[][][] makeDp() {
    int[][][] dp = new int[21][21][21];
    for(int i=0; i<21; i++) {
      for(int j=0; j<21; j++) {
        dp[0][i][j] = 1;
      }
    }
    for(int i=0; i<21; i++) {
      for(int j=0; j<21; j++) {
        dp[i][0][j] = 1;
      }
    }
    for(int i=0; i<21; i++) {
      for(int j=0; j<21; j++) {
        dp[i][j][0] = 1;
      }
    }

    for(int i=1; i<21; i++) {
      for(int j=1; j<21; j++) {
        for(int k=1; k<21; k++) {
          if(i<j && j<k) {
            dp[i][j][k] = dp[i][j][k-1] + dp[i][j-1][k-1]-dp[i][j-1][k];
          } else {
            dp[i][j][k] = dp[i-1][j][k]+dp[i-1][j-1][k]
                +dp[i-1][j][k-1]-dp[i-1][j-1][k-1];
          }
        }
      }
    }
    return dp;
  }

  public static void main(String[] args) {
    int[][][] dp = makeDp();

    Scanner sc = new Scanner(System.in);

    while(true) {
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      if(a==-1 && b==-1 && c==-1) break;
      else if(a<=0 || b<=0 || c<=0) {
        System.out.println("w("+a+", "+b+", "+c+") = "
            +1);
      } else if(a>20 || b>20 || c>20) {
        System.out.println("w("+a+", "+b+", "+c+") = "
            +dp[20][20][20]);
      }else {
        System.out.println("w("+a+", "+b+", "+c+") = "
            +dp[a][b][c]);
      }
    }
  }
}