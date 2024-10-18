package org.problem.solving.BOJ.Java7562;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Java7562 {
    static int I;
    static int[][] arr;
    static boolean[][] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i = 0; i < T; i++) {
            I = Integer.parseInt(br.readLine()); // 판 크기
            arr = new int[I][I];
            visited = new boolean[I][I];
            st = new StringTokenizer(br.readLine());
            int nightX = Integer.parseInt(st.nextToken()); // 말 위치
            int nightY = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            int goalX = Integer.parseInt(st.nextToken()); // 말 위치
            int goalY = Integer.parseInt(st.nextToken());
            System.out.println(BFS(nightX, nightY, goalX, goalY));
        }

    }

    private static int BFS(int nightX, int nightY, int goalX, int goalY) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] {nightX, nightY});
        arr[nightX][nightY] = 0;
        visited[nightX][nightY] = true;
        while (!queue.isEmpty()){
            int[] currentXY = queue.poll();
            int currentX = currentXY[0];
            int currentY = currentXY[1];
            if (currentX == goalX && currentY == goalY){
                return arr[currentX][currentY];
            }
            // 다음 이동 좌표 추가
            if (currentX + 1 < I && currentY + 2 < I && !visited[currentX + 1][currentY + 2]) {
                queue.add(new int[] {currentX + 1, currentY + 2});
                arr[currentX + 1][currentY + 2] = arr[currentX][currentY]+1;
                visited[currentX + 1][currentY + 2] = true;
            }

            if (currentX + 2 < I && currentY + 1 < I && !visited[currentX + 2][currentY + 1]) {
                queue.add(new int[] {currentX + 2, currentY + 1});
                arr[currentX + 2][currentY + 1] = arr[currentX][currentY]+1;
                visited[currentX + 2][currentY + 1] = true;
            }

            if (currentX + 2 < I && currentY - 1 >= 0 && !visited[currentX + 2][currentY - 1]) {
                queue.add(new int[] {currentX + 2, currentY - 1});
                arr[currentX + 2][currentY - 1] = arr[currentX][currentY]+1;
                visited[currentX + 2][currentY - 1] = true;
            }
            if (currentX + 1 < I && currentY - 2 >= 0 && !visited[currentX + 1][currentY - 2]) {
                queue.add(new int[] {currentX + 1, currentY - 2});
                arr[currentX + 1][currentY - 2] = arr[currentX][currentY]+1;
                visited[currentX + 1][currentY - 2] = true;
            }

            if (currentX - 2 >= 0 && currentY + 1 < I && !visited[currentX - 2][currentY + 1]) {
                queue.add(new int[] {currentX - 2, currentY + 1});
                arr[currentX - 2][currentY + 1] = arr[currentX][currentY]+1;
                visited[currentX - 2][currentY + 1] = true;
            }
            if (currentX - 1 >= 0 && currentY + 2 < I && !visited[currentX - 1][currentY + 2]) {
                queue.add(new int[] {currentX - 1, currentY + 2});
                arr[currentX - 1][currentY + 2] = arr[currentX][currentY]+1;
                visited[currentX - 1][currentY + 2] = true;
            }

            if (currentX - 2 >= 0 && currentY - 1 >= 0 && !visited[currentX - 2][currentY - 1]) {
                queue.add(new int[] {currentX - 2, currentY - 1});
                arr[currentX - 2][currentY - 1] = arr[currentX][currentY]+1;
                visited[currentX - 2][currentY - 1] = true;
            }
            if (currentX - 1 >= 0 && currentY - 2 >= 0 && !visited[currentX - 1][currentY - 2]) {
                queue.add(new int[] {currentX - 1, currentY - 2});
                arr[currentX - 1][currentY - 2] = arr[currentX][currentY]+1;
                visited[currentX - 1][currentY - 2] = true;
            }
        }
        return -1; // 불가능 할때
    }
}