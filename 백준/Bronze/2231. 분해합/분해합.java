import java.util.*;
import java.lang.Math;

public class Main {
  // a는 b의 생성자인가?
  public static boolean isConstructor(int a, int b) {
    if(a>b) return false;

    int sum = 0;
    int temp = a;
    for(int i=0; i<7; i++) {
      int num = temp / (int)(Math.pow(10, 6-i));
      temp -= num * Math.pow(10, 6-i);
      sum += num;
    }

    sum += a;

    if(b == sum) return true;
    return false;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();

    // N보다 작은 모든 자연수에 대해 확인
    // 생성자인 수가 나오면 그것이 가장 작은 생성자
    int i = 1;
    while(i<=N) {
      if(isConstructor(i, N)) {
        break;
      }
      i++;
    }

    if (i >= N) {
      System.out.println(0);
    } else {
      System.out.println(i);
    }

  }

}