import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[][] arr = new int[100][100];
        
        int n = sc.nextInt();
        for(int i=0; i<n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            for(int j=0; j<10; j++) {
                for(int k=0; k<10; k++) {
                    arr[x+j][y+k] = 1;
                }
            }
        }
        
        // 1의 개수 구하기
        int count = 0;
        for(int i=0; i<100; i++) {
            for(int j=0; j<100; j++) {
                if(arr[i][j]==1) count++;
            }
        }
        System.out.println(count);
        
    }
}