package org.problem.solving.BOJ.Java11123;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Java11123 {
    static int H;
    static int W;
    static char[][] arr;
    static boolean[][] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            H = Integer.parseInt(st.nextToken());
            W = Integer.parseInt(st.nextToken());
            arr = new char[H][W];
            visited = new boolean[H][W];
            for (int j = 0; j <H; j++) {
                String line = br.readLine();
                for (int k = 0; k < W; k++) {
                    arr[j][k] = line.charAt(k);
                }
            }
            int ans = 0;
            for (int j = 0; j < H; j++) {
                for (int k = 0; k < W; k++) {
                    if (!visited[j][k] && arr[j][k] == '#'){
                        bfs(j,k);
                        ans += 1;
                    }
                }
            }
            System.out.println(ans);

        }
    }

    private static void bfs(int j, int k) {
        Queue<int[]> que = new LinkedList<>();
        que.add(new int[]{j,k});
        visited[j][k] = true;
        int[] UD = {1,-1,0,0};
        int[] LR = {0,0,1,-1};
        while (!que.isEmpty()){
            int[] current = que.poll();
            int x = current[0];
            int y = current[1];
            for (int i = 0; i <= 3; i++) {
                int nX = x + UD[i];
                int nY = y + LR[i];
                //좌표, 방문, '#' > 방문 체크
                if (nX >= 0 && nX < H &&
                    nY >= 0 && nY < W &&
                    arr[nX][nY] == '#' && !visited[nX][nY]){
                    que.add(new int[] {nX, nY});
                    visited[nX][nY] = true;
                }
            }
        }
    }
}