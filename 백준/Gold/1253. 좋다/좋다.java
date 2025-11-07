import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 배열 초기화
        int n = sc.nextInt();
        long[] arr = new long[n];
        for(int i=0; i<n; i++)
            arr[i] = sc.nextLong();
        
        Arrays.sort(arr);
        
        int count = 0;
        for(int i =0; i<n; i++) {
            int left = 0;
            int right = n-1;
            
            while(left < right) {
                if(left==i || right==i) {
                    if(left==i) left++;
                    else right--;
                    continue;
                }
                
                long sum = arr[left]+arr[right];
                if(sum==arr[i]) {
                    count++;
                    break;
                }
                else if(sum > arr[i]) right--;
                else if(sum < arr[i]) left++;
            }
        }
        System.out.println(count);
    }
}