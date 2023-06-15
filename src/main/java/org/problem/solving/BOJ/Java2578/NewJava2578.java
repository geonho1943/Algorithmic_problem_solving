package org.problem.solving.BOJ.Java2578;
import java.util.*;

public class NewJava2578 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 빙고판 입력 받기
        int[][] board = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                board[i][j] = scanner.nextInt();
            }
        }

        // 사회자가 부르는 수 입력 받기
        int[][] numbers = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                numbers[i][j] = scanner.nextInt();
            }
        }

        // 철수가 외치는 순서를 저장할 리스트
        List<Integer> shoutedNumbers = new ArrayList<>();

        // 사회자가 부르는 수를 하나씩 확인하면서 빙고 여부를 체크
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                // 사회자가 부른 숫자
                int number = numbers[i][j];
                shoutedNumbers.add(number);

                // 해당 숫자를 빙고판에서 찾아서 지움
                for (int k = 0; k < 5; k++) {
                    for (int l = 0; l < 5; l++) {
                        if (board[k][l] == number) {
                            board[k][l] = 0;
                        }
                    }
                }

                // 빙고 체크
                if (checkBingo(board)) {
                    System.out.println(shoutedNumbers.size());
                    return;
                }
            }
        }
    }

    // 빙고 여부를 체크하는 함수
    private static boolean checkBingo(int[][] board) {
        int bingoCount = 0;

        // 가로 빙고 체크
        for (int i = 0; i < 5; i++) {
            boolean isBingo = true;
            for (int j = 0; j < 5; j++) {
                if (board[i][j] != 0) {
                    isBingo = false;
                    break;
                }
            }
            if (isBingo) {
                bingoCount++;
            }
        }

        // 세로 빙고 체크
        for (int i = 0; i < 5; i++) {
            boolean isBingo = true;
            for (int j = 0; j < 5; j++) {
                if (board[j][i] != 0) {
                    isBingo = false;
                    break;
                }
            }
            if (isBingo) {
                bingoCount++;
            }
        }

        // 대각선 빙고 체크
        boolean isBingo = true;
        for (int i = 0; i < 5; i++) {
            if (board[i][i] != 0) {
                isBingo = false;
                break;
            }
        }
        if (isBingo) {
            bingoCount++;
        }

        isBingo = true;
        for (int i = 0; i < 5; i++) {
            if (board[i][4 - i] != 0) {
                isBingo = false;
                break;
            }
        }
        if (isBingo) {
            bingoCount++;
        }

        // 빙고가 3개 이상인지 체크
        return bingoCount >= 3;
    }
}
