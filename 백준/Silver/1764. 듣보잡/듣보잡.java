import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        List<String> nugu = new ArrayList<>();
        
        Set<String> nameNotHeard = new HashSet<>();
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int haveNotHeard = Integer.parseInt(st.nextToken());
        int haveNotSeen = Integer.parseInt(st.nextToken());
        
        for(int i=0; i<haveNotHeard; i++) {
            nameNotHeard.add(br.readLine());
        }
        
        for(int i=0; i<haveNotSeen; i++) {
            String name = br.readLine();
            if(nameNotHeard.contains(name))
                nugu.add(name);
        }
        
        Collections.sort(nugu);
        System.out.println(nugu.size());
        for(String name : nugu)
            System.out.println(name);
    }
}