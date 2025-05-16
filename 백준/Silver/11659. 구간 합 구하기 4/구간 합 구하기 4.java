import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws IOException {
    	BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        
        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());
        
        long[] s = new long[N+1];
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for(int i=1;i<N+1;i++) { 
         s[i] = s[i-1] + Integer.parseInt(stringTokenizer.nextToken());
        }
        
        for(int m=0;m<M;m++) {
        	stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int i = Integer.parseInt(stringTokenizer.nextToken());
            int j = Integer.parseInt(stringTokenizer.nextToken());
            System.out.println(s[j]-s[i-1]);
        }
    }
}