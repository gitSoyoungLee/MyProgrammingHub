import java.util.*;

public class Main {
    public static int[] recursion(char[] s, int l, int r, int prev[]) {
        prev[1]++;
        if(l >= r) {
            prev[0]=1;
            return prev;
        }
        else if(s[l] != s[r]) {
            prev[0]=0;
            return prev;
        }
        else return recursion(s, l+1, r-1, prev);
    }

    public static int[] isPalindrome(char[] s){
        int[] set= {0,0};
        return recursion(s,0,s.length-1,set);
    }

    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        for(int i=0;i<n;i++){
            int[] result=isPalindrome(scanner.next().toCharArray());
            System.out.println(result[0]+" "+result[1]);
        }
    }


}