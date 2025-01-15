import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String word = s.next().toUpperCase(); // 대소문자 무시
        char[] array = word.toCharArray();

        // 알파벳 빈도수 저장용 맵
        Map<Character, Integer> map = new HashMap<>();

        // 빈도수 계산
        for (char c : array) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // 최대 빈도수 계산
        int maxCount = Collections.max(map.values());
        List<Character> maxChars = new ArrayList<>();

        // 최대 빈도수를 가진 문자들 찾기
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == maxCount) {
                maxChars.add(entry.getKey());
            }
        }

        // 결과 출력
        if (maxChars.size() > 1) {
            System.out.println("?");
        } else {
            System.out.println(maxChars.get(0));
        }
    }
}
