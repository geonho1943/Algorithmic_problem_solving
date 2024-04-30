package org.problem.solving.BOJ.Java21736;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Queue;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Java21736 {
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {-1, 1, 0, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        char[][] map = new char[n][m];
        boolean[][] boolMap = new boolean[n][m];
        Queue<int[]> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            String mapLine = br.readLine();
            for (int j = 0; j < m; j++) {
                map[i][j] = mapLine.charAt(j);
                if (map[i][j] == 'I') {
                    queue.offer(new int[]{i, j}); // 도연이의 위치를 큐에 추가
                    boolMap[i][j] = true;
                }
            }
        }
        int answer = 0;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int curX = current[0];
            int curY = current[1];

            for (int i = 0; i < 4; i++) {
                int nextX = curX + dx[i];
                int nextY = curY + dy[i];

                // 캠퍼스 범위를 벗어나지 않고, 방문하지 않은 경우
                if (nextX >= 0 && nextX < n && nextY >= 0 && nextY < m && !boolMap[nextX][nextY]) {
                    if (map[nextX][nextY] == 'O') { // 이동 가능
                        queue.offer(new int[]{nextX, nextY});
                        boolMap[nextX][nextY] = true;
                    } else if (map[nextX][nextY] == 'P') { // 사람을 만난 경우
                        queue.offer(new int[]{nextX, nextY});//사람을 만난 경우에도 좌표이동을 큐에 추가 해야 한다..
                        answer++;
                        boolMap[nextX][nextY] = true;
                    }
                }

            }
        }
        if (answer > 0) {
            System.out.println(answer);
        } else {
            System.out.println("TT");
        }
    }
}