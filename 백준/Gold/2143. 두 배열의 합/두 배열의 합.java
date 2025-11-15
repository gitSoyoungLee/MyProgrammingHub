import java.util.*;

public class Main {
  public static void main(String[] args) {
    // 초기 입력
    Scanner sc = new Scanner(System.in);

    long target = sc.nextLong();
    int n = sc.nextInt();
    long[] arrA = new long[n];
    for(int i=0; i<n; i++) arrA[i] = sc.nextInt();
    int m = sc.nextInt();
    long[] arrB = new long[m];
    for(int i=0; i<m; i++) arrB[i] = sc.nextInt();

    // 부 배열의 합 구하기
    long[] partialSumA = partialSum(arrA);
    long[] partialSumB = partialSum(arrB);

    // 이분탐색
    long count = 0;
    for(int i=0; i<partialSumA.length; i++) {
      long b = target - partialSumA[i];
      int upper = upperBound(partialSumB, b);
      int lower = lowerBound(partialSumB, b);

      count+=(upper-lower);
    }

    System.out.println(count);

  }

  public static long[] partialSum(long[] arr) {
    int length = (arr.length*(arr.length+1)) / 2;
    long[] result = new long[length];
    int index = 0;
    for(int i=0; i<arr.length; i++) {
      long sum = 0;
      for(int j=i; j<arr.length; j++) {
        sum += arr[j];
        result[index] = sum;
        index++;
      }
    }
    Arrays.sort(result);
    return result;
  }

  // target이 해당 arr에서 나오는 가장 작은 인덱스 찾기
  public static int lowerBound(long[] arr, long target) {
    int low = 0;
    int high = arr.length;
    while(low<high) {
      int mid = (low + high) / 2;
      if(arr[mid] < target) low = mid + 1;
      else high = mid;
    }
    return low;
  }

  // target보다 큰 값이 처음으로 나오는 위치 찾기
  public static int upperBound(long[] arr, long target) {
    int low = 0;
    int high = arr.length;
    while(low < high) {
      int mid = (low + high) / 2;
      if(arr[mid] <= target) low = mid + 1;
      else high = mid;
    }
    return low;
  }
}