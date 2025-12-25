import java.util.*;
import java.math.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        BigInteger a = new BigInteger(br.readLine());
        String op = br.readLine();
        BigInteger b = new BigInteger(br.readLine());
        if (op.equals("*")) {
            System.out.print(a.multiply(b));
        } else {
            System.out.print(a.add(b));
        }
    }
}