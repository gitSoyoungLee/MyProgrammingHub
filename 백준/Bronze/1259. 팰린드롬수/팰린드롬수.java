import java.io.*;
import java.util.*;

public class Main {
    static StringBuilder sb;
    static boolean isPalindrome(String str) {
        sb = new StringBuilder(str);
        
        if(sb.reverse().toString().equals(str))
            return true;
        return false;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str;
        while(true) {
            str = br.readLine();
            if(str.equals("0")) break;
            
            if(isPalindrome(str))
                System.out.println("yes");
            else
                System.out.println("no");
        }
        
        return;
        
    }
}