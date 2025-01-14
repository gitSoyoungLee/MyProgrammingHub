import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int t = s.nextInt(); // 테스트 케이스 개수

        for (int i = 0; i < t; i++) {
            int a = s.nextInt();
            int b = s.nextInt();

            // 마지막 자릿수에만 집중
            a %= 10;

            // 주기 구하기
            List<Integer> cycle = new ArrayList<>();
            int value = a;
            do {
                cycle.add(value);
                value = (value * a) % 10;
            } while (!cycle.contains(value));

            // b를 주기로 나눠 나머지를 이용해 결과 계산
            int cycleLength = cycle.size();
            int index = (b - 1) % cycleLength; // b-1: 0-based index
            int result = cycle.get(index);

            // 결과 출력 (컴퓨터 번호는 0이 아닌 10으로 출력)
            System.out.println(result == 0 ? 10 : result);
        }
    }
}
