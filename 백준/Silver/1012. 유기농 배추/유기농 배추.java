import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * 1. 지도를 전체 순회하며 배추가 있고, 아직 방문하지 않은 칸 찾기
 * 2. 그 칸에서부터 지렁이++, BFS 시작
 * 3. 이 BFS는 방문한 칸 모두 방문 처리
 * 4. 방문한 배추들은 건너뜀
 * 5. BFS 호출 횟수 = 최소 배추지렁이 수
 */

public class Main {
    static BufferedReader br;
    static StringTokenizer st;
    static int[] dr = {-1, 1, 0 ,0};
    static int[] dc = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++) {
            System.out.println(calculateWorms());
        }

    }

    public static int calculateWorms() throws IOException {
        st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[][] arr = new int[N][M];
        boolean[][] visited = new boolean[N][M];
        for(int i=0; i<K; i++) {
            st = new StringTokenizer(br.readLine());
            int col = Integer.parseInt(st.nextToken());
            int row = Integer.parseInt(st.nextToken());
            arr[row][col] = 1;
        }

        int worms = 0;
        for(int i=0; i<N; i++) {
            for(int j=0; j<M; j++) {
                if(arr[i][j] == 1 && !visited[i][j]) {
                    worms++;
                    Queue<int[]> queue = new LinkedList<>();
                    queue.offer(new int[]{i,j});
                    visited[i][j] = true;
                    while(!queue.isEmpty()) {
                        int[] curr = queue.poll();
                        int r = curr[0];
                        int c = curr[1];
                        for(int k=0; k<4; k++) {
                            int nr = r + dr[k];
                            int nc = c + dc[k];
                            if(nr >= 0 && nr < N && nc >=0 && nc < M &&
                                !visited[nr][nc] && arr[nr][nc] == 1) {
                                visited[nr][nc] = true;
                                queue.offer(new int[]{nr, nc});
                            }
                        }
                    }
                }
            }
        }
        return worms;
    }
}