class Solution {
    public int solution(int[] players, int m, int k) {
        int answer = 0;
        
        int idx = 0;
        int[] server = new int [24];
        int count = 0;
        while(idx < 24){
            
            int cur = players[idx];
            
            int dist = 0;
            
            while(cur >= m * (server[idx] + 1 + dist)){
                dist++;
            }
            
            // 서버 개수 늘리기
            for(int i=idx; i<idx + k; i++){
                if(i >= 24) continue;
                server[i] += dist;
            }      
            
            count += dist;
            
            idx++;
        }
    
        answer = count;
        return answer;
    }
}