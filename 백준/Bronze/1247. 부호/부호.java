import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String [] arr = new String[3];

        for(int i=0;i<3;i++) {
            long n=s.nextInt();
            BigInteger sum = BigInteger.valueOf(0);
            for(long j=0;j<n;j++) {
                sum=sum.add(s.nextBigInteger());
            }
            if(sum.signum()==0) arr[i]="0";
            else if(sum.signum()==1) arr[i]="+";
            else arr[i]="-";
        }

        for(int i=0;i<3;i++) System.out.println(arr[i]);
    }
}