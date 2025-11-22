import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int up = Integer.parseInt(st.nextToken());
        int down = Integer.parseInt(st.nextToken());
        int goal = Integer.parseInt(st.nextToken());
        
		int day = (goal - down) / (up - down);
		if ((goal - down) % (up - down) != 0)
			day++;
 
		System.out.println(day);
    }
}