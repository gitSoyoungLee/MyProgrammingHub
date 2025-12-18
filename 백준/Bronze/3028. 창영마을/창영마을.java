import java.util.*;
import java.io.*;

public class Main {
    static int[] arr = {1, 0, 0};
    
    static void swap(int idx1, int idx2) {
        if(arr[idx1] == arr[idx2]) return;
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String cmd = br.readLine();
        
        for(char c : cmd.toCharArray()) {
            if(c=='A') {
                swap(0, 1);
            } else if(c=='B') {
                swap(1, 2);
            } else if(c=='C') {
                swap(0, 2);
            }
        }
        
        for(int i = 1; i<=3; i++) {
            if(arr[i-1]==1) {
                System.out.println(i);
                return;
            }
        }
    }
}