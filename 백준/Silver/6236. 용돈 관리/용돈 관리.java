import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static boolean isPossible(int[] arr, int m, int k) {
    int curr_balance = 0;
    int count = 0;
    for (int i : arr) {
      if (curr_balance < i) {
        curr_balance = k;
        count++;
        if (curr_balance < i) {
          return false;
        }
      }
      curr_balance -= i;
    }
    return count <= m;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int m = sc.nextInt();

    int sum = 0;
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      int num = sc.nextInt();
      arr[i] = num;
      sum += num;
    }
    int[] unsorted_arr = arr.clone();
    Arrays.sort(arr);
    int low = arr[0];
    int high = sum;
    int mid = (low + high) / 2;

    while (low <= high) {
      if (!isPossible(unsorted_arr, m, mid)) {
        low = mid + 1;
      } else {
        if (!isPossible(unsorted_arr, m, mid - 1)) {
          break;
        }
        high = mid - 1;
      }
      mid = (low + high) / 2;
    }
    System.out.println(mid);
  }
}