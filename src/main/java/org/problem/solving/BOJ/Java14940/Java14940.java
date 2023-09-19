package org.problem.solving.BOJ.Java14940;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Java14940 {
    static int n, m;
    static int[][] map;
    static int[][] distances;
    static boolean[][] visited;
    static int[] dx = {-1, 0, 1, 0}; // 상, 우, 하, 좌
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        map = new int[n][m];
        distances = new int[n][m];
        visited = new boolean[n][m];
        int startRow = 0, startCol = 0;

        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(input[j]);
                if (map[i][j] == 2) {
                    startRow = i;
                    startCol = j;
                }
            }
        }

        bfs(startRow, startCol);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (map[i][j] == 0) {
                    sb.append("0 ");
                } else if (!visited[i][j]) {
                    sb.append("-1 ");
                } else {
                    sb.append(distances[i][j] + " ");
                }
            }
            sb.append("\n");
        }

        System.out.print(sb);
    }

    public static void bfs(int row, int col) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{row, col});
        distances[row][col] = 0;
        visited[row][col] = true;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx >= 0 && nx < n && ny >= 0 && ny < m && map[nx][ny] != 0 && !visited[nx][ny]) {
                    queue.add(new int[]{nx, ny});
                    distances[nx][ny] = distances[x][y] + 1;
                    visited[nx][ny] = true;
                }
            }
        }
    }
}