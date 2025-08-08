import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean[] check = {false, false, false};// l,k,p
        for(int i=0;i<3;i++) {
            char[] str = s.nextLine().toCharArray();
            if(str[0]=='l') check[0]=true;
            if(str[0]=='k') check[1]=true;
            if(str[0]=='p') check[2]=true;
        }
        
        if(check[0]==true && check[1]==true && check[2]==true) {
            System.out.println("GLOBAL");
        } else
            System.out.println("PONIX");
    }
}