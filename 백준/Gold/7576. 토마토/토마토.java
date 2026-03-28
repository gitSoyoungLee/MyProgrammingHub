import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * 1. 초기 배열 box[][] 구하기
 * 2. 방문 배열 = 토마토가 익은 날짜 배열 만들기
 * days[][] = new int[N][M] -> 1과 -1은 0(익음)으로, 0은 -1(안 익음)로 초기화
 * 3. 큐 선언 -> 익은 토마토들 넣고 시작
 * 4. 큐가 빌 때까지
 *  - 상하좌우 칸 중 범위 안에 있고, 아직 안 익었고, box[nx][ny]!=-1이면
 *  - 큐에 넣고, days[nx][ny] = days[x][y] + 1
 *  5. 다 익었는지 확인 -> 전부 0 이상?
 *  6. days 중 최댓값 출력
 */


public class Main {

    static BufferedReader br;
    static StringTokenizer st;
    static int N, M;
    static int[][] box;
    static int[][] days;
    static Queue<int[]> queue;

    static int[] dr = {0, 0, -1, 1};    // 상하좌우
    static int[] dc = {-1, 1, 0, 0};

    public static void main(String[] args) throws IOException {
        // 초기 입력
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        box = new int[M][N];
        days = new int[M][N];
        queue = new LinkedList<>();

        for(int row=0; row<M; row++) {
            st = new StringTokenizer(br.readLine());
            for(int col=0; col<N; col++) {
                int num = Integer.parseInt(st.nextToken());
                box[row][col] = num;
                if (num == 1) {
                    days[row][col] = 0;
                    queue.offer(new int[]{row, col});
                } else if(num == -1)
                    days[row][col] = 0;
                else days[row][col] = -1;
            }

        }

        while(!queue.isEmpty()) {
            int[] tomato = queue.poll();
            int r = tomato[0];
            int c = tomato[1];
            for(int i=0; i<4; i++) {
                int nr = r + dr[i];
                int nc = c + dc[i];
                if(nr >= 0 && nr < M && nc >=0 && nc < N && box[nr][nc]!=-1 && days[nr][nc] < 0) {
                    queue.offer(new int[]{nr, nc});
                    days[nr][nc] = days[r][c] + 1;
                }
            }
        }

        // days에서 최댓값 찾기
        int max = days[0][0];
        for(int i=0; i<M; i++) {
            for(int j=0; j<N; j++) {
                if(days[i][j] == -1) {
                    System.out.println("-1");
                    return;
                }
                if(max < days[i][j])
                    max = days[i][j];
            }
        }


        System.out.println(max);
    }
}