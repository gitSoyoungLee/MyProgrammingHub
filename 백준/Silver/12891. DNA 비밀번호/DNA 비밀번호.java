
import java.util.*;

class Main {
	public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
        
        int S_length = scanner.nextInt();
        int P_length = scanner.nextInt();
        String str = scanner.next();
        char[] S = str.toCharArray();
        int[] check = new int[4];
        for(int i=0; i<4; i++) {
        	check[i] = scanner.nextInt();
        }
        
        int start_index = 0;
        int end_index = P_length-1;
        int[] status = new int[4];
       	for(int index = start_index; index<=end_index; index++) {
        	if(S[index] == 'A') status[0] = status[0] + 1;
            else if(S[index] == 'C') status[1] = status[1] + 1;
            else if(S[index] == 'G') status[2] = status[2] + 1;
            else if(S[index] == 'T') status[3] = status[3] + 1;
        }
      
        
        int count = 0;
        while(end_index <  S_length) {
        	if(status[0] >= check[0] &&
            	status[1] >= check[1] &&
                status[2] >= check[2] &&
                status[3] >= check[3]) count++;
            
            if(S[start_index] == 'A') status[0] = status[0] - 1;
            else if(S[start_index] == 'C') status[1] = status[1] - 1;
            else if(S[start_index] == 'G') status[2] = status[2] - 1;
            else if(S[start_index] == 'T') status[3] = status[3] - 1;
            
            
            start_index++;
            end_index++;
            
            if(end_index>=S_length) break;
            
            if(S[end_index] == 'A') status[0] = status[0] + 1;
            else if(S[end_index] == 'C') status[1] = status[1] + 1;
            else if(S[end_index] == 'G') status[2] = status[2] + 1;
            else if(S[end_index] == 'T') status[3] = status[3] + 1;
            
        }
        
        System.out.println(count);
        
    }
}