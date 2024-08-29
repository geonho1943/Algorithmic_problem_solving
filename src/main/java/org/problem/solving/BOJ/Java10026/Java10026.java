package org.problem.solving.BOJ.Java10026;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class Java10026 {
    static int N;
    static String[][] grid;
    static boolean[][] tfGrid;
    static int[] dx = {-1, 1, 0, 0}; // 좌, 우
    static int[] dy = {0, 0, 1, -1}; // 상, 하

    static int ansR = 0;
    static int ansG = 0;
    static int ansB = 0;
    static int ansRG = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        grid = new String[N][N];
        tfGrid = new boolean[N][N];
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < N; j++) {
                grid[i][j] = String.valueOf(line.charAt(j));
            }
        }

        // 무색약자의 경우
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!tfGrid[i][j]) {
                    if (Objects.equals(grid[i][j], "R")) {
                        getColor(i, j, "R");
                        ansR++;
                    } else if (Objects.equals(grid[i][j], "G")) {
                        getColor(i, j, "G");
                        ansG++;
                    } else if (Objects.equals(grid[i][j], "B")) {
                        getColor(i, j, "B");
                        ansB++;
                    }
                }
            }
        }

        // tfGrid 초기화
        tfGrid = new boolean[N][N];

        // 색약자의 경우(적녹)
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!tfGrid[i][j]) {
                    if (Objects.equals(grid[i][j], "R") || Objects.equals(grid[i][j], "G")) {
                        getColorByRG(i, j);
                        ansRG++;
                    }
                }
            }
        }

        System.out.println(ansR + ansB + ansG + " " + (ansRG + ansB));
    }

    private static void getColor(int x, int y, String color) {
        if (x >= 0 && x < N && y >= 0 && y < N && !tfGrid[x][y]) {
            String check = grid[x][y];
            if (Objects.equals(check, color)) {
                tfGrid[x][y] = true;
                for (int i = 0; i < 4; i++) {
                    getColor(x + dx[i], y + dy[i], color);
                }
            }
        }
    }

    private static void getColorByRG(int x, int y) {
        if (x >= 0 && x < N && y >= 0 && y < N && !tfGrid[x][y]) {
            String check = grid[x][y];
            if (Objects.equals(check, "R") || Objects.equals(check, "G")) {
                tfGrid[x][y] = true;
                for (int i = 0; i < 4; i++) {
                    getColorByRG(x + dx[i], y + dy[i]);
                }
            }
        }
    }
}