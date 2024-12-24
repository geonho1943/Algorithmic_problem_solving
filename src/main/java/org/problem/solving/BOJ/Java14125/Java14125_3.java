package org.problem.solving.BOJ.Java14125;

import java.io.*;
import java.util.*;

public class Java14125_3 {
    static int[][] board;
    static int N;
    static int minBlocks = Integer.MAX_VALUE;
    static List<int[]> target; // {x, y, status}

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
        target = new ArrayList<>();
        int maxRow = 0, maxCol = 7;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            target.add(new int[]{x - 1, y - 1, 0}); // index 0부터 시작 할 거임
            maxRow = Math.max(maxRow, y);
        }
        board = new int[maxRow + 2][maxCol];

        solve(0, 0);

        System.out.println(minBlocks);
    }

    // 백트래킹
    public static void solve(int row, int blocks) {
        // 모든 타겟이 커버되었는지 확인
        if (isFinishGame()) {
            minBlocks = Math.min(minBlocks, blocks); // 최소 블럭 수 갱신
            return;
        }
        // 이미 최소값보다 많은 블럭을 사용 중이면 탐색 중단
        if (blocks >= minBlocks) return;

        // 모든 칸 탐색
        for (int y = row; y < board.length; y++) {
            for (int x = 0; x < board[0].length; x++) {
                // 가로 블럭 배치 시도
                if (canPlaceHorizontal(x, y)) {
                    placeHorizontal(x, y, true); // 블럭 배치
                    solve(y, blocks + 1); // 재귀 호출
                    placeHorizontal(x, y, false); // 블럭 제거
                }
                // 세로 블럭 배치 시도
                if (canPlaceVertical(x, y)) {
                    placeVertical(x, y, true); // 블럭 배치
                    solve(y, blocks + 1); // 재귀 호출
                    placeVertical(x, y, false); // 블럭 제거
                }
            }
        }
    }

    // 모든 타겟이 커버되었는지 확인
    public static boolean isFinishGame() {
        for (int[] pos : target) {
            if (pos[2] == 0) { // status = 0: 커버 안됨
                return false;
            }
        }
        return true;
    }

    // 가로 블럭 가능 확인
    public static boolean canPlaceHorizontal(int x, int y) {
        // 오른쪽으로 2칸 범위 확인
        if (x + 2 >= board[0].length) return false;
        // 블럭 아래에 바닥 또는 다른 블럭이 (한칸 이라도) 있어야 함
        if (y > 0 && (board[y - 1][x] == 0 && board[y - 1][x + 1] == 0 && board[y - 1][x + 2] == 0)) {
            return false; // 아래 3칸이 모두 비어 있으면 배치 불가능
        }
        // 배치하려는 칸이 비어 있어야 함
        return board[y][x] == 0 && board[y][x + 1] == 0 && board[y][x + 2] == 0;
    }

    // 가로 블럭 배치/제거
    public static void placeHorizontal(int x, int y, boolean place) {
        int value = place ? 1 : 0; // 1로 블럭 배치, 0으로 복구
        board[y][x] = value;
        board[y][x + 1] = value;
        board[y][x + 2] = value;

        for (int[] pos : target) { // 타겟 리스트 상태 업데이트
            if (pos[1] == y && (pos[0] == x || pos[0] == x + 1 || pos[0] == x + 2)) {
                pos[2] = place ? 1 : 0;
            }
        }
    }

    // 세로 블럭 배치 체크
    public static boolean canPlaceVertical(int x, int y) {
        if (y + 2 >= board.length) return false;
        if (y > 0 && board[y - 1][x] == 0) {
            return false;
        }
        return board[y][x] == 0 && board[y + 1][x] == 0 && board[y + 2][x] == 0;
    }
    // 세로 블럭 배치/제거
    public static void placeVertical(int x, int y, boolean place) {
        int value = place ? 1 : 0; // 1로 블럭 배치, 0으로 복구
        board[y][x] = value;
        board[y + 1][x] = value;
        board[y + 2][x] = value;
        // 타겟 리스트 상태 업데이트
        for (int[] pos : target) {
            if (pos[0] == x && (pos[1] == y || pos[1] == y + 1 || pos[1] == y + 2)) {
                pos[2] = place ? 1 : 0;
            }
        }
    }
}