import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String n = s.next();
        int f = s.nextInt();

        char[] n_array = n.toCharArray();
        boolean check=false;
        for(int i=0;i <=9;i++) {
            for(int j=0; j<=9; j++) {
                char ci=(char)(i+'0');
                char cj=(char)(j+'0');
                n_array[n.length()-2]= ci;
                n_array[n.length()-1]= cj;
                String new_num=String.valueOf(n_array);
                int new_num_int = Integer.parseInt(new_num);
                if(new_num_int%f==0) {
                    System.out.print(ci);
                    System.out.print(cj);
                    check=true;
                    break;
                }
            }
            if(check==true) break;
        }


    }
}