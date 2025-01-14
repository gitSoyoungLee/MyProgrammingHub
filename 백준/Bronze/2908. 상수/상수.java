import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int b = s.nextInt();

        int a1 = a/100;
        a1 += ((a-a/100*100)/10)*10;
        a1 += (a-(a/10)*10)*100;

        int b1 = b/100;
        b1 += ((b-b/100*100)/10)*10;
        b1 += (b-(b/10)*10)*100;

        if(a1 > b1) System.out.println(a1);
        else System.out.println(b1);


    }
}