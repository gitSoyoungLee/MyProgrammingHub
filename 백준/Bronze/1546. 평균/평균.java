import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int subject = s.nextInt();

        double[] score = new double[subject];
        double max=0;
        for(int i=0;i<subject;i++) {
            score[i]=s.nextDouble();
            if(max<score[i]) max=score[i];
        }

        double new_avg = 0;
        for(int i=0;i<subject;i++) {
            score[i]=(score[i]/max)*100;
            new_avg+=score[i];
        }

        new_avg/=subject;

        System.out.println(new_avg);

    }
}