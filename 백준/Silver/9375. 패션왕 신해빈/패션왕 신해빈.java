import java.util.*;
import java.io.*;
import java.util.Map.Entry;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int totalTestCase = Integer.parseInt(br.readLine());
    for(int i=0; i<totalTestCase; i++) {
      HashMap<String, Set<String>> map = new HashMap<>();
      int clothes = Integer.parseInt(br.readLine());

      for(int j=0; j<clothes; j++) {
        StringTokenizer st = new StringTokenizer(br.readLine());
        String clothesName = st.nextToken();
        String category = st.nextToken();
        if(map.containsKey(category)) {
          Set<String> set = map.get(category);
          set.add(clothesName);
          map.put(category, set);
        } else {

          Set<String> set = new HashSet<>();
          set.add(clothesName);
          map.put(category, set);
        }
      }
      if(map.size() == 0) {
        System.out.println(0);
        continue;
      }
      int count = 1;
      for(Entry<String, Set<String>> entry : map.entrySet()) {
        count *= (entry.getValue().size() + 1);
      }
      System.out.println(count-1);

    }
  }
}