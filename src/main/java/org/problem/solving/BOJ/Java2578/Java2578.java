package org.problem.solving.BOJ.Java2578;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Java2578 {
    static int bingo[][] = new int[5][5];
    static boolean board[][] = new boolean[5][5];

    public static void main(String[] args) throws IOException {
        // 빙고판 입력 받기
        // 빙고판 2차원 배열로 만들기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < 5; j++) {
                bingo[i][j] = Integer.parseInt(st.nextToken());
            }
        } // 빙고판 입력 완료

        // 사회자 번호 받기
        // 사회자 번호를 빙고판에 대조 후 boolean 2차원 배열에 체크하기
        for (int i = 0; i < 5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < 5; j++) {
                int num = Integer.parseInt(st.nextToken());
                check(num);
            }
        }
        finalCheck();//빙고 완성 확인

    }

    // 체크 메서드 구현하기
    private static void check(int num) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (num == bingo[i][j]){
                    board[i][j] = true;
                }
            }
        }
//        return
    }

    private static void finalCheck(){
        // 빙고 완성 여부 체크
        int count = 0; // 완성된 빙고 수
        for (int i = 0; i < 5; i++) {
            boolean isBingo = true;
            for (int j = 0; j < 5; j++) {
                if (!board[i][j]) { // 가로 방향 빙고 확인
                    isBingo = false;
                    break;
                }
            }
            if (isBingo) count++;

            isBingo = true;
            for (int j = 0; j < 5; j++) {
                if (!board[j][i]) { // 세로 방향 빙고 확인
                    isBingo = false;
                    break;
                }
            }
            if (isBingo) count++;


            isBingo = true;
            for (int j = 0; j < 5; j++) {
                if (!board[j][j]) { // 대각선 방향 빙고 확인
                    isBingo = false;
                    break;
                }
            }
            if (isBingo) count++;

            isBingo = true;
            for (int j = 0; j < 5; j++) {
                if (!board[j][4 - j]) {
                    isBingo = false;
                    break;
                }
            }
            if (isBingo) count++;
        }
        System.out.println(count);
    }

}
