import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        String b = s.next();
        char[] b_arr = b.toCharArray();
        System.out.println(a*(Integer.parseInt(b_arr[2]+"")));
        System.out.println(a*(Integer.parseInt(b_arr[1]+"")));
        System.out.println(a*(Integer.parseInt(b_arr[0]+"")));
        System.out.println(a*(Integer.parseInt(b)));


    }
}