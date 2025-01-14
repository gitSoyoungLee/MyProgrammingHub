import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long n = s.nextInt();

        long bunmo=0;
        long bunja=0;

        long idx=1;
        long sum=2;

        while(idx <= n) {
            for(int i=1;i<sum;i++) {
                if(sum % 2 == 0) {
                    bunmo = i;
                    bunja=sum-i;
                } else {
                    bunmo=sum-i;
                    bunja=i;
                }
                idx++;
                if(idx==n+1) break;
            }
            sum++;
            if(idx==n+1) break;
        }

        System.out.println(bunja+"/"+bunmo);
    }
}