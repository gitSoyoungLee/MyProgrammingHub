import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        String word = s.next();
        char[] word_array = word.toCharArray();
        while(num-1 > 0) {
            char[] nextWord = s.next().toCharArray();
            for(int i = 0; i < nextWord.length; i++){
                if(word_array[i] != nextWord[i])
                    word_array[i]='?';
            }
            num--;
        }

        System.out.println(word_array);
    }
}