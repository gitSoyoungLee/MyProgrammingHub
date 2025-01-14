import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, List<Integer>> map = new HashMap<>();
        map.put("black", Arrays.asList(0,1));
        map.put("brown", Arrays.asList(1,10));
        map.put("red", Arrays.asList(2,100));
        map.put("orange", Arrays.asList(3,1000));
        map.put("yellow", Arrays.asList(4,10000));
        map.put("green", Arrays.asList(5,100000));
        map.put("blue", Arrays.asList(6,1000000));
        map.put("violet", Arrays.asList(7,10000000));
        map.put("grey", Arrays.asList(8,100000000));
        map.put("white", Arrays.asList(9,1000000000));

        Scanner s = new Scanner(System.in);


        String color = s.next();
        long result = map.get(color).get(0)*10;

        color = s.next();
        result += map.get(color).get(0);

        color = s.next();
        result *= map.get(color).get(1);

        System.out.println(result);

    }
}