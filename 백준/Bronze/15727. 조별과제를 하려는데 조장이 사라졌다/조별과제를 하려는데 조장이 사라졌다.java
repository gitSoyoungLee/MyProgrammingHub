import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int distance=scanner.nextInt();
        int n=1;
        while(distance>5){
            distance-=5;
            n++;
        }
        System.out.println(n);
    }
}