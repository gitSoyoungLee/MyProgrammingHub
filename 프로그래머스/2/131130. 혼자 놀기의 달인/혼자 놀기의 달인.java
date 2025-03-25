import java.util.*;

class Solution {

    
    public int solution(int[] cards) {
        int answer = 0;
        
        for(int i = 0; i < cards.length; i++){
            // 첫 번째 그룹
            int box_index = i;
            List<Integer> opened_boxes_g1 = new ArrayList<>();
            while(true) {
                // 열어야 할 박스가 이미 열려있다면 첫 번째 그룹 종료
                if(opened_boxes_g1.contains(box_index)) {
                    break;   
                }
                opened_boxes_g1.add(box_index);
                box_index = cards[box_index]-1;
            }
            
            // 첫 번째 그룹에서 모든 박스를 열었다면 0점
            if(opened_boxes_g1.size()==cards.length) {
                continue;
            }
            
            // 두 번째 그룹
            List<Integer> opened_boxes_g2 = new ArrayList<>();
            // 첫 번째 그룹 끝난 후 남은 박스에서 임의로 선택해 시작
            for(int j=0;j<cards.length;j++) {
                opened_boxes_g2.clear();
                box_index = j;
                while(true) {
                    if(opened_boxes_g1.contains(box_index))
                        break;
                    if(opened_boxes_g2.contains(box_index)) {
                        break;   
                    }
                    opened_boxes_g2.add(box_index);
                    box_index = cards[box_index]-1;
                }
            
                // 점수 계산
                System.out.println(opened_boxes_g1.size()+" * "+opened_boxes_g2.size());
                int newScore = opened_boxes_g1.size()*opened_boxes_g2.size();
                if(answer < newScore) {
                    answer = newScore;
                }
            }
            
        }
        return answer;
    }
}