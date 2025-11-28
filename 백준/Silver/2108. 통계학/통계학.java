import java.util.*;
import java.io.*;
import java.lang.Math;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int total = Integer.parseInt(br.readLine());
        int[] arr = new int[total];

        double sum = 0;
        for (int i = 0; i < total; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }

        bw.write(String.valueOf((int) Math.round((double) sum / total))); // 산술평균
        bw.newLine();

        Arrays.sort(arr);
        bw.write(String.valueOf(arr[total / 2])); // 중앙값
        bw.newLine();

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < total; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        int mostFrequent = map.entrySet().stream()
            .map(entry -> entry.getValue())
            .sorted(Comparator.reverseOrder())
            .collect(Collectors.toList())
            .get(0);
        List<Integer> list = map.entrySet().stream()
            .filter(entry -> entry.getValue() == mostFrequent)
            .map(entry -> entry.getKey())
            .sorted()
            .collect(Collectors.toList());

        if(list.size() >=2 ) bw.write(String.valueOf(list.get(1)));
        else bw.write(String.valueOf(list.get(0)));

        bw.newLine();

        int range = arr[total - 1] - arr[0]; // 범위
        bw.write(String.valueOf(range));

        bw.flush();
    }
}