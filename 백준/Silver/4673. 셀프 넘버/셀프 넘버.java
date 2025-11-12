import java.util.*;

public class Main {
    public static void main(String[] args) {
        int i = 1;
        while(i<=10000) {
            boolean isSelfNumber = true;
            for(int j=1; j<i; j++) {
                int temp = j;
                int thousand = temp/1000;
                temp -= thousand*1000;
                int hundred = temp/100;
                temp -= hundred*100;
                int ten = temp/10;
                temp -= ten*10;
                int one = temp;
                if(j+thousand+hundred+ten+one == i) {
                    isSelfNumber = false;
                    break;
                }
            }
            if(isSelfNumber) System.out.println(i);
            i++;
        }
    }
}