import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i]=sc.nextInt();
        
        int max = 0;
        
        for(int i = 0; i<n; i++) {
            for(int j=0; j<n; j++) {
                for(int k=0; k<n; k++) {
                    if(i!=j && j!=k && k!=i) {
                        int sum = arr[i] + arr[j] + arr[k];
                        if(sum > max && sum <=m) max = sum;
                    }
                }
            }
        }
        System.out.println(max);
    }
}