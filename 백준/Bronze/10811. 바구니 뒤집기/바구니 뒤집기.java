import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int m = s.nextInt();

        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i]=i+1;
        }

        for(int step=0;step<m;step++) {
            int i = s.nextInt();
            int j = s.nextInt();
            if(i==j) continue;
            else {
                int[] temp = new int[j-i+1];
                int idx=0;
                for(int t=j; t>=i ; t--) {
                   temp[idx]=arr[t-1];
                   idx++;
                }
                idx=0;
                for(int t=i; t<=j; t++) {
                    arr[t-1]=temp[idx];
                    idx++;
                }
            }
        }

        for(int i=0;i<n;i++) {
            System.out.print(arr[i]+" ");
        }

    }
}