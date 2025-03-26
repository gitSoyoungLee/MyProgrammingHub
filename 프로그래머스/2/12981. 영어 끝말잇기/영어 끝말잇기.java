import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        
        boolean lose = false;

        int round = 1;
        List<String> wordsList = new ArrayList<>();
        
        for(int i=0;i<words.length;i++){
            String lastWord = null;
            if(wordsList.size() > 0) {
                lastWord = wordsList.get(i-1);
            }
            // 중복으로 지는 경우
            // 틀린 경우
            // 한 글자인 경우
            if(wordsList.contains(words[i])
               || words[i].length() == 1 
               || (lastWord!=null && lastWord.charAt(lastWord.length()-1) != words[i].charAt(0))) {
                   
            
                answer[0]=i%n+1;    
                System.out.println("i = " + i +", 번호: "+answer[0]);
                lose = true;
                break;
            }
            // 다음 라운드로
            wordsList.add(words[i]);
            if((i+1)%n==0) round++;
        }
        if(lose==true)
            answer[1]=round;
        else {
            answer[0]=0;
            answer[1]=0;
        }
        return answer;
    }
}