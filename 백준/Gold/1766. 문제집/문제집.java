import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();    // 전체 문제의 수 = 노드 수
        int v = sc.nextInt();    // 문제 풀이 정보 개수 = 간선 개수
        
        // 인접 리스트
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0; i<=n; i++) 
            adj.add(new ArrayList<>());
        for(int i=0; i<v; i++) {
            int from = sc.nextInt();
            int to = sc.nextInt();
            adj.get(from).add(to);
        }
        
        topologicalSort(n, adj);
    }
    
    public static void topologicalSort(int n, List<List<Integer>> adj) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        
        // 진입차수 구하기
        int[] indegrees = new int[n+1];
        for(int i=1; i<=n; i++) {
            for(int next : adj.get(i)) {
                indegrees[next] ++;
            }
        }
        // 진입차수가 0인 것부터 큐에 넣기
        for(int i=1; i<=n; i++) {
            if(indegrees[i]==0) queue.add(i);
        }
        
        // 큐가 빌 때까지
        while(!queue.isEmpty()) {
            // 큐에서 꺼내기
            int peek = queue.poll();
            System.out.print(peek +" ");
            // 노드 삭제 = 연결된 노드의 진입차수 1 감소
            for(int i : adj.get(peek)) {
                indegrees[i]--;
                // 진입 차수 0이면 큐에 넣기
                if(indegrees[i]==0) queue.add(i);
            }            
        }
    }
}