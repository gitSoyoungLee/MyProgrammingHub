import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    if(n==4 || n==7) {
      System.out.println(-1);
      return;
    }
    int three = 0;
    int five = n/5;

    if(n%5==0) {

    } else if(n%5==3) {
      three = 1;
    } else if(n%5==2) {
      three = 2;
    } else if(n%5==1) {
      three = 1;
    } else if(n%5==4) {
      three = 2;
    }

    System.out.println(three+five);
  }
}