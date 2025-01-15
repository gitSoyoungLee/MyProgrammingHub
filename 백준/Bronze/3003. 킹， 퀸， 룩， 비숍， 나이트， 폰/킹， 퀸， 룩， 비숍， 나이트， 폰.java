import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] black = {1,1,2,2,2,8};
        Scanner s = new Scanner(System.in);

        int[] white = new int[6];
        for(int i=0;i<6;i++) {
            white[i]=s.nextInt();
            System.out.print(black[i]-white[i]+" ");
        }

    }
}