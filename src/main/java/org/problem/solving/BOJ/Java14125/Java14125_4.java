package org.problem.solving.BOJ.Java14125;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Java14125_4 {
    static int[][] board;
    static int N;
    static int minBlocks = Integer.MAX_VALUE;
    static List<int[]> target; // {x, y, status}
    static int targetCovered = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
        target = new ArrayList<>();
        int maxHei = 0, maxLode = 7;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int load = Integer.parseInt(st.nextToken()); // 1 ~ 7
            int height = Integer.parseInt(st.nextToken()); // 10^8
            target.add(new int[]{height - 1, load - 1, 0}); // index 0부터 시작 할 거임
            maxHei = Math.max(maxHei, height);
        }
        board = new int[maxHei + 2][maxLode]; // 높이, 레일
        solve(0, 0);
        System.out.println(minBlocks);
    }
    // 백트래킹
    public static void solve(int currentHeight, int blocks) {
        // 모든 타겟이 커버되었는지 확인
        if (isFinishGame()) {
            minBlocks = Math.min(minBlocks, blocks); // 최소 블럭 수 갱신
            return;
        }
        // 이미 최소값보다 많은 블럭을 사용 중이면 탐색 중단
        if (blocks >= minBlocks) return;
        // 모든 칸 탐색
        for (int i = 0; i < 7; i++) { // i = load 순회
            // 세로 블럭 배치 시도
            if (canPlaceVertical(currentHeight, i)) {
                placeVertical(currentHeight, i, true); // 블럭 배치
                solve(currentHeight + 3, blocks + 1); // 재귀 호출
                placeVertical(currentHeight, i, false); // 블럭 제거
            }
            // 가로 블럭 배치 시도
            if (canPlaceHorizontal(currentHeight, i)) {
                placeHorizontal(currentHeight, i, true); // 블럭 배치
                solve(currentHeight +1, blocks + 1); // 재귀 호출
                placeHorizontal(currentHeight, i, false); // 블럭 제거
            }

        }

    }

    // isFinishGame 단순화
    public static boolean isFinishGame() {
        return targetCovered == target.size();
    }

    // 가로 블럭 배치 가능 확인
    public static boolean canPlaceHorizontal(int height, int load) {
        if (height >= board.length || load > 4) return false; // 보드 범위를 벗어날 때
        if (board[height][load] == 0 && board[height][load+1] == 0 && board[height][load+2] == 0){ // 빈칸일때
            if (height == 0) return true; // 시작점일때
            else if (board[height-1][load] == 1 || board[height-1][load+1] == 1 || board[height-1][load+2] == 1) {
                return true; // 공중에 있을때 한칸이라도 깔고 있다면
            }
        }
        return false; // 미충족시 배치 불가
    }
    // 세로 블럭 배치 가능 확인
    public static boolean canPlaceVertical(int height, int load) {
        if (height + 2 >= board.length) return false; // 보드 범위를 벗어날 때
        if (board[height][load] == 0 && board[height+1][load] == 0 && board[height+2][load] == 0){ // 빈칸일때
            if (height == 0) { // 시작점
                return true;
            } else if (board[height-1][load] == 1) { // 공중에서 블럭이 받쳐줄 때
                return true;
            }
        }
        return false;
    }

    // 가로 블럭 배치/제거
    public static void placeHorizontal(int height, int load, boolean place) {
        int value = place ? 1 : 0; // 1로 블럭 배치, 0으로 복구
        board[height][load] = value;
        board[height][load + 1] = value;
        board[height][load + 2] = value;
        for (int[] pos : target) { // 타겟 리스트 상태 업데이트
            if (pos[0] == height && (pos[1] == load || pos[1] == load + 1 || pos[1] == load + 2)) {
                if (place && pos[2] == 0) targetCovered++;
                if (!place && pos[2] == 1) targetCovered--;
                pos[2] = place ? 1 : 0;

            }
        }
    }
    // 세로 블럭 배치/제거
    public static void placeVertical(int height, int load, boolean place) {
        int value = place ? 1 : 0; // 1로 블럭 배치, 0으로 복구
        board[height][load] = value;
        board[height + 1][load] = value;
        board[height + 2][load] = value;
        // 타겟 리스트 상태 업데이트
        for (int[] pos : target) {
            if (pos[1] == load && (pos[0] == height || pos[0] == height + 1 || pos[0] == height + 2)) {
                if (place && pos[2] == 0) targetCovered++;
                if (!place && pos[2] == 1) targetCovered--;
                pos[2] = place ? 1 : 0;
            }
        }
    }
}