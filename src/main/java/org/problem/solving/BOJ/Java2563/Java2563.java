package org.problem.solving.BOJ.Java2563;

import java.util.Scanner;

public class Java2563 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        boolean[][] white = new boolean[100][100];
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int x; int y;
            x = sc.nextInt();
            y = sc.nextInt();
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    white[x+j][y+k] = true;
                }
            }
        }
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (white[i][j]==true)ans++;
            }
        }
        System.out.println(ans);
    }
}