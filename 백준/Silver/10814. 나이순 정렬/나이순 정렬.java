import java.util.*;
import java.io.*;

public class Main {

    static class Member {
        int age;
        int signUpOrder;
        String name;

        public Member(int age, int signUpOrder, String name) {
            this.age = age;
            this.signUpOrder = signUpOrder;
            this.name = name;
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st;

        List<Member> members = new ArrayList<>();
        int signUpOrder = 1;

        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            Member m = new Member(age, signUpOrder, name);
            members.add(m);
            signUpOrder++;
        }

        members.sort(new Comparator<Member>() {
            @Override
            public int compare(Member a, Member b) {
                if(a.age == b.age)
                    return a.signUpOrder - b.signUpOrder;
                return a.age - b.age;
            }
        });

        StringBuilder sb = new StringBuilder();
        for(Member m : members) {
            sb.append(String.valueOf(m.age)).append(" ")
                .append(m.name).append("\n");
        }

        System.out.println(sb);

    }
}