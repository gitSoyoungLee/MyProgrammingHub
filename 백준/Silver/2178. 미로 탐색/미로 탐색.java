import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * 1. N, M 그리고 미로 정보를 입력받아 배열에 저장한다.
 * 2. BFS를 위한 Queue를 생성하고, 시작점 (0, 0)을 넣는다.
 * 3. 방문 체크 배열을 만들고 시작점을 방문 처리한다.
 * 4. Queue가 빌 때까지 반복:
 *     a. Queue에서 현재 좌표 (x, y)를 꺼낸다.
 *     b. 현재 좌표에서 상, 하, 좌, 우 4방향을 검사한다.
 *     c. 새로운 좌표 (nx, ny)가:
 *         - 미로 범위 안에 있고
 *         - 벽이 아니며 (1이고)
 *         - 아직 방문하지 않았다면
 *     d. (nx, ny)를 방문 처리한다.
 *     e. (nx, ny)의 거리값 = (x, y)의 거리값 + 1
 *     f. Queue에 (nx, ny)를 넣는다.
 * 5. (N-1, M-1) 위치의 거리값을 출력한다.
 */

public class Main {
    static int n;
    static int m;
    static int[][] maze;

    public static void main(String[] args) throws IOException {
        // 1. 초기 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        maze = new int[n][m];

        for(int i=0; i<n; i++) {
            char[] arr = br.readLine().toCharArray();
            for(int j=0; j<m; j++) {
                maze[i][j] = arr[j] - '0';
            }
        }

        // 2. 큐 생성 후 시작점 넣기
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0, 0});

        // 3. 순회: 큐가 빌 때까지 반복
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        int[][] lengths = new int[n][m]; // (0,0)으로부터 (x,y)까지의 거리 정보
        boolean[][] visited = new boolean[n][m]; // 방문한 노드 체크
        visited[0][0] = true;
        while(!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];

            int i;
            for(i=0; i<4 ; i++) {
                // 미로 범위 안에 있고,
                // 이동할 수 있는 칸이고,
                // 아직 방문하지 않은 칸인가?
                int nx = x + dx[i];
                int ny = y + dy[i];
                if(nx < 0 || nx >= n || ny < 0 || ny >= m)
                    continue;
                if(maze[nx][ny] != 1)
                    continue;
                if(visited[nx][ny])
                    continue;
                visited[nx][ny] = true;
                lengths[nx][ny] = lengths[x][y] + 1;
                queue.offer(new int[]{nx, ny});
            }
        }

        System.out.println(lengths[n-1][m-1] + 1);


    }
}
