package org.problem.solving.BOJ.Java4963;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Java4963_2 { // 섬갯수 count 로 구현 해봄
    static int W;
    static int H;
    static int[][] arr;
    static boolean[][] visited;
    static int count;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            W = Integer.parseInt(st.nextToken());
            H = Integer.parseInt(st.nextToken());
            if (W == 0 && H == 0) break;
            arr = new int[H][W];
            visited = new boolean[H][W];
            for (int i = 0; i < H; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < W; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            count = 0;

            for (int i = 0; i < H; i++) {
                for (int j = 0; j < W; j++) {
                    BFS(i,j);
                }
            }
            System.out.println(count);
        }
    }

    private static void BFS(int i, int j) {
        Queue<int[]> queueXY = new LinkedList<>();
        queueXY.add(new int[]{i,j});
        int currentCount = 0;
        while (!queueXY.isEmpty()){
            int[] currentXY = queueXY.poll();
            int x = currentXY[0];
            int y = currentXY[1];
            if (!visited[x][y] && arr[x][y] == 1){
                // 첫방문, 섬,
                visited[x][y] = true;
                currentCount++;
                // 큐.add(인접좌표): 우좌상하, 우상 우하 좌상 좌하
                if (x+1 < H ){ // 우
                    queueXY.add(new int[] {x+1,y});
                    if (y+1 < W){ // 우상
                        queueXY.add(new int[] {x+1,y+1});
                    }
                    if (y-1 >= 0){ // 우하
                        queueXY.add(new int[] {x+1,y-1});
                    }
                }
                if (x-1 >= 0){ // 좌
                    queueXY.add(new int[] {x-1,y});
                    if (y+1 < W){ // 좌상
                        queueXY.add(new int[] {x-1,y+1});
                    }
                    if (y-1 >= 0){ // 좌하
                        queueXY.add(new int[] {x-1,y-1});
                    }
                }
                if (y+1 > W){ // 상
                    queueXY.add(new int[] {x,y+1});
                }
                if (y-1 >= 0){ // 하
                    queueXY.add(new int[] {x,y-1});
                }
                // 유효좌표,
            }

        }
        count+=currentCount;
    }
}
