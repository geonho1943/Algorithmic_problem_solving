package org.problem.solving.BOJ.Java7569;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Java7569 {
    static int M;
    static int N;
    static int H;
    static int[][][] box;
    static int[] dx = {1, -1, 0, 0, 0, 0}; // 상하좌우, 위아래
    static int[] dy = {0, 0, 1, -1, 0, 0};
    static int[] dz = {0, 0, 0, 0, 1, -1};
    static Queue<int[]> queue = new LinkedList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        H = Integer.parseInt(st.nextToken());
        box = new int[H][N][M];

        for (int h = 0; h < H; h++) {// 층
            for (int n = 0; n < N; n++) {
                st = new StringTokenizer(br.readLine());
                for (int m = 0; m < M; m++) {
                    box[h][n][m] = Integer.parseInt(st.nextToken());
                    if (box[h][n][m]==1) queue.add(new int[]{h,n,m});
                }
            }
        }
        System.out.println(bfs());
    }
    public static int bfs() {
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int z = current[0];
            int y = current[1];
            int x = current[2];

            // 6가지 방향으로 탐색
            for (int i = 0; i < 6; i++) {
                int nz = z + dz[i];
                int ny = y + dy[i];
                int nx = x + dx[i];

                // 상자 범위 내에 있고, 익지 않은 토마토(0)인 경우
                if (nz >= 0 && nz < H && ny >= 0 && ny < N && nx >= 0 && nx < M) {
                    if (box[nz][ny][nx] == 0) {
                        box[nz][ny][nx] = box[z][y][x] + 1; // 날짜 증가
                        queue.add(new int[]{nz, ny, nx});
                    }
                }
            }
        }

        int max = 0;
        for (int h = 0; h < H; h++) {
            for (int n = 0; n < N; n++) {
                for (int m = 0; m < M; m++) {
                    // 익지 않은 토마토가 있는 경우
                    if (box[h][n][m] == 0) {
                        return -1;
                    }
                    max = Math.max(max, box[h][n][m]);
                }
            }
        }
        return max - 1;
    }
}
