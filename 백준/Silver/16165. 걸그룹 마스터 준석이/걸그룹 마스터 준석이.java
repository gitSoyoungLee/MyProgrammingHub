import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static HashMap<String, String> members = new HashMap<>(); // key = memberName, value = groupName

    static StringBuilder sb = new StringBuilder();

    static void solve(int quizType, String quiz) {
        if(quizType==0) {
            // 해당 팀에 속한 멤버의 이름을 사전순으로 출력
            members.entrySet().stream()
                .filter(enrty -> enrty.getValue().equals(quiz))
                .map(entry -> entry.getKey())
                .sorted()
                .forEach(name -> sb.append(name).append("\n"));
        }
        else if(quizType==1) {
            // 해당 멤버가 속한 팀의 이름을 출력
            sb.append(members.get(quiz)).append("\n");
        }
    }

    public static void main(String[] args) throws IOException {

        StringTokenizer st = new StringTokenizer(br.readLine());
        int groups = Integer.parseInt(st.nextToken());
        int problems = Integer.parseInt(st.nextToken());

        for(int i=0; i<groups; i++) {
            String groupName = br.readLine();
            int groupSize = Integer.parseInt(br.readLine());
            for(int j=0; j<groupSize; j++)
                members.put(br.readLine(), groupName);
        }

        for(int i=0; i<problems; i++) {
            String quiz = br.readLine();
            int quizType = Integer.parseInt(br.readLine());
            solve(quizType, quiz);
        }

        System.out.println(sb.toString());
    }
}