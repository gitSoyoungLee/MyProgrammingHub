class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        int brown_width, brown_height, yellow_width, yellow_height;
        
        int total = brown + yellow;
        
        for(int i=1; i<=yellow; i++) {            
            yellow_width = i;
            brown_width = i+2;
            if(total % brown_width != 0) continue;
            brown_height = (total) / brown_width;
            yellow_height = brown_height - 2;
            //System.out.println("width = " + brown_width +" height = "+brown_height);
            
            if(brown_width < brown_height) continue;
            else if(yellow_height * yellow_width == yellow){
                answer[0] = brown_width;
                answer[1] = brown_height;
                break;
            }
        }
        
        
        return answer;
    }
}