import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int three = 0;
        int six = 0;
        int nine = 0;
        
        for(int i=1; i<= n; i++) {
            String str = String.valueOf(i);
            for(char c:str.toCharArray()) {
                if(c == '3') three++;
                if(c=='6') six++;
                if(c=='9') nine++;
            }
            
        }
        
        System.out.println(three+six+nine);
        
    }
}