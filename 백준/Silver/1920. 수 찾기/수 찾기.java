import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) 
            arr[i] = sc.nextInt();
        Arrays.sort(arr);
        int m = sc.nextInt();
        for(int i=0; i<m; i++) {
            int num = sc.nextInt();
            boolean isExist = isExist(arr, num);
            System.out.println((isExist)? 1 : 0);
        }
    }
    
    public static boolean isExist(int[] arr, int num) {        
        int low = 0;
        int high = arr.length - 1;
        int mid = (low + high) / 2;
        
        while(low <= high) {
            if(arr[mid] == num) {
                return true;
            } else if(arr[mid] > num) {
                high = mid - 1;
            } else
                low = mid + 1;
            mid = (low + high) / 2;
        }
        
        return false;
    }
}