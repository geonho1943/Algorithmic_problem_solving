package org.problem.solving.BOJ.Java14125;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Java14125 { // 삼트리스 답이 없는 문제
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[][] targetPositions = new int[N][2];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken()) - 1;
            int y = Integer.parseInt(st.nextToken());
            targetPositions[i] = new int[]{x, y};
        }

        Arrays.sort(targetPositions, (a, b) -> Integer.compare(a[1], b[1]));

        System.out.println(bruteForce(targetPositions));
    }

    public static boolean[][] createBoard(int[][] targetPositions) {
        boolean[][] placedBlocks = new boolean[7][10];

        for (int[] target : targetPositions) {
            placedBlocks[target[0]][target[1]] = true;
        }

        return placedBlocks;
    }

    public static int bruteForce(int[][] targets) {
        int minY = targets[0][1];
        int maxY = targets[0][1];

        for (int[] target : targets) {
            minY = Math.min(minY, target[1]);
            maxY = Math.max(maxY, target[1]);
        }

        int minBars = Integer.MAX_VALUE;
        boolean[][] placedBlocks = createBoard(targets);

        for (int minCol = 0; minCol < 6; minCol++) {
            for (int maxHeight = minY; maxHeight <= maxY; maxHeight++) {
                int bars = 0;

                for (int[] target : targets) {
                    int col = target[0];
                    int row = target[1];

                    if (row <= maxHeight) {
                        if (col > 0 && col < 6 && !placedBlocks[col - 1][row] &&
                                !placedBlocks[col + 1][row]) {
                            bars++;
                            placedBlocks[col - 1][row] = true;
                            placedBlocks[col + 1][row] = true;
                        } else {
                            while (row > 0 && !placedBlocks[col][row - 1]) {
                                bars++;
                                row--;
                            }
                        }
                    }
                }

                minBars = Math.min(minBars, bars);
            }
        }

        return minBars;
    }
}