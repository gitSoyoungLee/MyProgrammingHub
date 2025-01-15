import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int count = n;
        for(int i=0; i<n; i++) {
            char[] word = s.next().toCharArray();
            List<Character> list = new ArrayList<>();
            for(int j=0; j<word.length; j++) {
                if(!list.contains(word[j])) {
                    list.add(word[j]);
                } else if(word[j-1] != word[j]){
                    count--;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}