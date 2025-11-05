import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int[] arr = new int[n];
        
        for(int i=0;i<m;i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            int ball = sc.nextInt();
            
            for(int j=start-1; j<=end-1; j++)
                arr[j]=ball;
        }
        
        for(int i:arr)
            System.out.print(i + " ");
        
    }
}