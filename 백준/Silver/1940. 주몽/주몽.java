import java.util.*;

class Main {
	public static void main(String[] args) {
    	Scanner s = new Scanner(System.in);
        
        int N = s.nextInt();
        int M = s.nextInt();
        int[] arr = new int[N];
        for(int i=0;i<N;i++) {
        	arr[i] = s.nextInt();
        }
        
        Arrays.sort(arr);
        
        int i = 0;
        int j = N-1;
        int count = 0;
        
        while(i < j) {
        	int sum = arr[i] + arr[j];
            if(sum > M) {
             j--;
            }
            if(sum < M) {
             i++;
            }
            if(sum == M) {
             i++;
             j--;
             count++;
            }
        }
        System.out.println(count);
    }
}