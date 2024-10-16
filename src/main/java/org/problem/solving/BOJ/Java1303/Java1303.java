package org.problem.solving.BOJ.Java1303;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Java1303 {
    static int N;
    static int M;
    static String[][] arr;
    static boolean[][] visited;
    static int ansW;
    static int ansB;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken()); // 가로
        arr = new String[N][M];
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < M; j++) {
                arr[i][j] = String.valueOf(line.charAt(j));
            }
        }
        visited = new boolean[N][M];
        ansW = 0;
        ansB = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (!visited[i][j]){
                    BFS(i, j);
                }
            }
        }
        System.out.println(ansW+" "+ansB);
    }

    private static void BFS(int i, int j) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] {i,j});
        int ans = 0;
        String team = arr[i][j];
        while (!queue.isEmpty()){
            int[] nowXY = queue.poll();
            int x = nowXY[0];
            int y = nowXY[1];
            if (!visited[x][y]){ // 첫 방문 이라면
                ans++;
                visited[x][y] = true;
                // 상하좌우 큐에 넣기
                if (x+1 >= 0 && x+1 < N && y >= 0 && y < M && arr[x+1][y].equals(team)){ // 상
                    queue.add(new int[] {x+1,y});
                }
                if (x-1 >= 0 && x-1 < N && y >= 0 && y < M && arr[x-1][y].equals(team)){ // 하
                    queue.add(new int[] {x-1,y});
                }
                if (x >= 0 && x < N && y-1 >= 0 && y-1 < M && arr[x][y-1].equals(team)){ // 좌
                    queue.add(new int[] {x,y-1});
                }
                if (x >= 0 && x < N && y+1 >= 0 && y+1 < M && arr[x][y+1].equals(team)){ // 우
                    queue.add(new int[] {x,y+1});
                }
            }
        }
        if (team.equals("W")) ansW += ans*ans;
        else ansB += ans*ans;
    }
}