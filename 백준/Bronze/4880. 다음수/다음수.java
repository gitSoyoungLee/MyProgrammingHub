import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[] arr = new int[3];

    while(true) {
      for(int i=0; i<3; i++)
        arr[i] = sc.nextInt();
      if(arr[0] == 0 && arr[1] == 0 && arr[2] ==0)
        break;
      checkArray(arr);
    }

  }

  public static void checkArray(int[] arr) {
    int diff1 = arr[1] - arr[0];
    int diff2 = arr[2] - arr[1];

    if(diff1 == diff2) {
      System.out.println("AP " + (arr[2]+diff1));
      return;
    }

    diff1 = arr[1] / arr[0];
    diff2 = arr[2] / arr[1];

    if(diff1 == diff2) {
      System.out.println("GP " + (arr[2] * diff1));
    }
  }
}