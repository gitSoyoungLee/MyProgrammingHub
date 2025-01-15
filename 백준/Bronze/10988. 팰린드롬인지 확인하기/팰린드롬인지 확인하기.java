import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        char[] word = s.next().toCharArray();
        char[] reverse = new char[word.length];

        int idx=0;
        for(int i=word.length-1; i>=0; i--) {
            reverse[idx] = word[i];
            idx++;
        }

        if(String.valueOf(word).equals(String.valueOf(reverse))) System.out.println("1");
        else System.out.println("0");
    }
}