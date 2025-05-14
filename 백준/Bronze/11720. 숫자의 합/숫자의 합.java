import java.util.*;

class Main {
	public static void main(String[] args) {
    	Scanner s = new Scanner(System.in);
        int N = s.nextInt();
    	String str = s.next();
    	char[] arr = str.toCharArray();
    	int total = 0;
    	for(char c : arr) {
    		total += (c-48);
    	}
        System.out.println(total);
    }
}