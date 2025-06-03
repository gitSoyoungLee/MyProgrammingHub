import java.util.*;

class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        
        int[] letters = new int[5];
        
        for(char c:s.toCharArray()){
            if(c=='H') letters[0] = letters[0] + 1;
            if(c=='I') letters[1] = letters[1] + 1;
            if(c=='A') letters[2] = letters[2] + 1;
            if(c=='R') letters[3] = letters[3] + 1;
            if(c=='C') letters[4] = letters[4] + 1;
        }
        
        int min = letters[0];
        for(int i = 1; i<5;i++){
            if(min > letters[i]) min = letters[i];
        }
        
        System.out.println(min);
    }
}