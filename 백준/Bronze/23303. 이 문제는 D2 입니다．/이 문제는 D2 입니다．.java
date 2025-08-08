import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        String str = s.nextLine();
        
        if(str.contains("D2") || str.contains("d2")) {
            System.out.println("D2");
        } else System.out.println("unrated"); 
       
    }
}