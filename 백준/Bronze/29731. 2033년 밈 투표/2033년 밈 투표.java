import java.util.*;
import java.io.*;

public class Main {
    
    static List<String> promise = List.of(
          "Never gonna give you up"
        , "Never gonna let you down"
        , "Never gonna run around and desert you"
        , "Never gonna make you cry"
        , "Never gonna say goodbye"
        , "Never gonna tell a lie and hurt you"
        , "Never gonna stop");

    public static void main(String[] arsgs) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        for(int i=0; i<n; i++) {
            if(!promise.contains(br.readLine())) {
                System.out.println("Yes");
                return;
            }
        }
        
        System.out.println("No");
        return;
        
    }
}