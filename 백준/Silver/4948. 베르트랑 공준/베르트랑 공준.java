import java.util.*;
import java.io.*;
import java.lang.Math;

public class Main {

    // 소수이면 false, 아니면 true
    static boolean[] prime = new boolean[123456*2 + 1];

    static void initPrime() {
        prime[0] = true;
        prime[1] = true;

        for(int i=2; i<=Math.sqrt(prime.length); i++) {
            if(prime[i]) continue;

            for(int j=i*i; j<prime.length; j+=i) {
                prime[j] = true;
            }
        }
    }
    static int solve(int n) {
        int count = 0;
        for(int i=n+1; i<=2*n; i++) {
            if (!prime[i])
                count++;
        }
        return count;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        initPrime();

        int n = Integer.parseInt(br.readLine());
        while(n != 0) {
            sb.append(solve(n)).append("\n");
            n = Integer.parseInt(br.readLine());
        }

        System.out.println(sb.toString());
    }
}