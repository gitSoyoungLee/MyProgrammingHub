import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;
        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};

        int[][] dist = new int[n][m];   // 0 = 아직 방문 안 함
        Queue<int[]> q = new ArrayDeque<>();
        q.add(new int[]{0, 0});
        dist[0][0] = 1;

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            for (int d = 0; d < 4; d++) {
                int nx = cur[0] + dx[d];
                int ny = cur[1] + dy[d];

                if (nx < 0 || ny < 0 || nx >= n || ny >= m) continue; // 범위 먼저
                if (maps[nx][ny] == 0) continue;                       // 벽
                if (dist[nx][ny] != 0) continue;                       // 이미 방문

                dist[nx][ny] = dist[cur[0]][cur[1]] + 1;
                q.add(new int[]{nx, ny});
            }
        }
        return dist[n - 1][m - 1] == 0 ? -1 : dist[n - 1][m - 1];
    }
}