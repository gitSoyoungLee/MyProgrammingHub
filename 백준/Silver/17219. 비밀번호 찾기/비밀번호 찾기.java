import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int totalSites = Integer.parseInt(st.nextToken());
        int targetSites = Integer.parseInt(st.nextToken());
        
        HashMap<String, String> map = new HashMap<>();
        for(int i=0; i<totalSites; i++) {
            st = new StringTokenizer(br.readLine());
            map.put(st.nextToken(), st.nextToken());
        }
        
        for(int i=0; i<targetSites; i++) {
            System.out.println(map.get(br.readLine()));
        }
    }
}