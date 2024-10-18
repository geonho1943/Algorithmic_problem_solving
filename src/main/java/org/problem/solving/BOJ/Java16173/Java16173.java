package org.problem.solving.BOJ.Java16173;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Java16173 {
    static int N;
    static int[][] arr;
    static boolean[][] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        arr = new int[N][N];
        visited = new boolean[N][N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        System.out.println(BFS());
    }

    private static String BFS() {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0,0});
        visited[0][0] = true;
        while (!queue.isEmpty()){
            int[] currentXY = queue.poll();
            int x = currentXY[0];
            int y = currentXY[1];
            if (x == N-1 && y == N-1) return "HaruHaru";
            int w = arr[x][y];
            if (x + w < N && !visited[x+w][y]){ // 우
                queue.add(new int[]{x+w,y});
                visited[x+w][y] = true;
            }
            if (x - w >= 0 && !visited[x-w][y]){ // 좌
                queue.add(new int[]{x-w,y});
                visited[x-w][y] = true;
            }
            if (y + w < N && !visited[x][y+w]){ // 상
                queue.add(new int[]{x,y+w});
                visited[x][y+w] = true;
            }
            if (y - w >= 0 && !visited[x][y-w]){ // 하
                queue.add(new int[]{x,y-w});
                visited[x][y-w] = true;
            }

        }
        return "Hing";
    }
}