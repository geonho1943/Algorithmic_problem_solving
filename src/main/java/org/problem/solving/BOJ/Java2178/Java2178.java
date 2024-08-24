package org.problem.solving.BOJ.Java2178;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Java2178 {
    static boolean[][] visitedMap;
    static int[][] map;
    static int[][] moveLength;
    static int[] moveX = {1, -1, 0, 0};
    static int[] moveY = {0, 0, 1, -1};
    static int n;
    static int m;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        map = new int[n][m];
        moveLength = new int[n][m];
        visitedMap = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            for (int j = 0; j < m; j++) {
                map[i][j] = line.charAt(j) - '0'; // 한 글자씩 읽어 정수로 변환
            }
        }
        System.out.println(mapBfs());

    }

    private static int mapBfs() {
        //최소 이동 거리 구하기
        Queue<int[]> que = new LinkedList<>();
        que.add(new int[]{0,0});
        visitedMap[0][0] = true; //방문 체크
        moveLength[0][0] = 1;

        while (!que.isEmpty()){
            int[] xy = que.poll();
            //상하좌우 체크후 이동할좌표 큐에 저장
            for (int i = 0; i < 4; i++) {
                //우 좌 상 하 순서
                int newX = xy[0] + moveX[i];
                int newY = xy[1] + moveY[i];
                //map이 1(이동가능할경우), 방문한적 없는 경우, 좌표를 벗어나지않음
                if (newX >= 0 && newY >= 0 && newX < n && newY < m &&
                        map[newX][newY] == 1 && !visitedMap[newX][newY] ){
                    que.add(new int[] {newX, newY});
                    //방문 기록
                    visitedMap[newX][newY] = true;
                    //거리 기록
                    moveLength[newX][newY] = moveLength[xy[0]][xy[1]]+1;
                }
            }
        }
        //큐가 비면
        return moveLength[n-1][m-1];
    }
}