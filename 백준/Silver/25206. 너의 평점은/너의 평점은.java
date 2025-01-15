import java.util.*;

public class Main {
    public static void main(String[] args) {
        double score = 0;
        double size = 0;
        Scanner s = new Scanner(System.in);
        
        for (int i=0; i<20; i++) {
            String subject = s.next();
            double sub_size = s.nextDouble();
            String sub_score = s.next();
            if (!sub_score.equals("P")) {
                size += sub_size;
                if (sub_score.equals("A+")) {
                    score += 4.5 * sub_size;
                } else if (sub_score.equals("A0")) {
                    score += 4.0 * sub_size;
                } else if (sub_score.equals("B+")) {
                    score += 3.5 * sub_size;
                } else if (sub_score.equals("B0")) {
                    score += 3.0 * sub_size;
                } else if (sub_score.equals("C+")) {
                    score += 2.5 * sub_size;
                } else if (sub_score.equals("C0")) {
                    score += 2.0 * sub_size;
                } else if (sub_score.equals("D+")) {
                    score += 1.5 * sub_size;
                } else if (sub_score.equals("D0")) {
                    score += 1.0 * sub_size;
                } 
            }
        }
        System.out.println(score/size);
    }
}