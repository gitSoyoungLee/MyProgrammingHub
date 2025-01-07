import java.util.*;

public class Main {
    public static void main (String[] args){
        Scanner s = new Scanner(System.in);
        int sum=0;
        List<Integer> list=new ArrayList<>(Arrays.asList(9, 7, 8, 0, 9, 2, 1, 4, 1, 8));
        // 입력
        for(int i=0;i<3;i++){
            list.add(s.nextInt());
        }
        int count=1;
        for(int i:list){
            if(count%2==1) sum+=i;
            else if(count%2==0) sum+=i*3;
            count++;
        }
        System.out.println("The 1-3-sum is "+sum);
    }
}