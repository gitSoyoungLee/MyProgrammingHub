import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int count = 0;
        int sum=0;
        int prev = n;

        while(true) {
            if(count == 0) {
                sum = prev/10 + prev%10;
                //System.out.println(prev/10+"+"+prev%10+"="+sum);
                //System.out.print(sum+"+"+(prev%10)*10+"=");
                prev = sum%10 + (prev%10)*10;
                sum=prev;
                //System.out.println(prev);
            } else {
                int num = prev/10 + prev%10;
                //System.out.print((sum%10)*10 +"+"+ num%10);
                sum = (sum%10)*10 + num%10;
                prev = sum;
                //System.out.println("="+sum);
            }
            count++;
            if(sum==n) break;
        }

        System.out.println(count);

    }
}