package org.problem.solving.BOJ.Java2206;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Java2206 {
    static int[][] arr;
    static boolean[][] visit;
    static Queue<int[]> que;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        arr = new int[N][M];
        String row;
        for (int i = 0; i < N; i++) {
            row = br.readLine();
            for (int j = 0; j < M; j++) {
                arr[i][j] = row.charAt(j) - '0';
            }
        }
        visit = new boolean[N][M];
        que = new LinkedList<>();
        que.add(new int[]{0, 0, 0, 0}); // {x, y, 벽뚫사용여부, 이동횟수}
        System.out.println(bfs());
    }

    private static int bfs() {
        int[] ud = {1, -1, 0, 0};
        int[] lr = {0, 0, -1, 1};
        int[] current;
        while (!que.isEmpty()){
            current = que.poll();
            visit[current[0]][current[1]] = true;
            // 종료 상황 처리
            if (current[0] == arr.length-1 && current[1] == arr[0].length-1) {
             return current[3] + 1;
            }

            //상하 좌우 만족시 이동
            for (int i = 0; i < 4; i++) {
                int x = current[0] + ud[i];
                int y = current[1] + lr[i];
                // arr 범위 만족
                if (x >= 0 && x < arr.length && y >= 0 && y < arr[0].length){
                    // 첫 방문 체크
                    if (!visit[x][y]){
                        // 0 체크
                        if (arr[x][y] == 0){
                            // 모두 만족하면 큐에 추가
                            que.add(new int[] {x, y, current[2], current[3] + 1});
                        }else if (arr[x][y] == 1 && current[2] == 0){ // 벽뚫이 가능 할 때
                            // 1 일시 used가 false면 벽뚫 한번 사용, 큐 추가
                            que.add(new int[] {x, y, 1, current[3] + 1});
                        }

                    }
                }
            }
        }
        return -1;
    }
}