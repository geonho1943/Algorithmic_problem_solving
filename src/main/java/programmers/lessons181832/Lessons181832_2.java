package programmers.lessons181832;

import java.util.Arrays;

public class Lessons181832_2 {
    public static void main(String[] args) {
        int n = 5; // 예시로 5x5 배열을 생성합니다.
        int[][] matrix = new int[n][n]; // n x n 크기의 배열 생성

        int num = 1; // 시작 숫자
        int row = 0, col = 0; // 시작 위치
        int lastCol = n - 1; // 마지막 열 인덱스
        int lastRow = n - 1; // 마지막 행 인덱스

        while (num <= n * n) {
            // 오른쪽으로 이동
            for (int i = col; i <= lastCol; i++) {
                matrix[row][i] = num++;
            }
            row++; // 다음 행으로 이동

            // 아래쪽으로 이동
            for (int i = row; i <= lastRow; i++) {
                matrix[i][lastCol] = num++;
            }
            lastCol--; // 다음 열로 이동

            // 왼쪽으로 이동
            for (int i = lastCol; i >= col; i--) {
                matrix[lastRow][i] = num++;
            }
            lastRow--; // 이전 행으로 이동

            // 위쪽으로 이동
            for (int i = lastRow; i >= row; i--) {
                matrix[i][col] = num++;
            }
            col++; // 이전 열로 이동
        }

        // 배열 출력
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
