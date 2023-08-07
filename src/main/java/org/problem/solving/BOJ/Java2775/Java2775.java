package org.problem.solving.BOJ.Java2775;

import java.io.IOException;
import java.util.Scanner;

public class Java2775 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int k = sc.nextInt();
            int n = sc.nextInt();
            int[][] apartment = new int[k][n];
            for (int j = 0; j <= 14; j++) {
                apartment[0][j] = j;
                apartment[j][1] = 1;
            }
            for (int j = 1; j <= k; j++) {
                for (int l = 2; l <= n; l++) {
                    apartment[j][l] = apartment[j-1][l] + apartment[j][l-1];
                }
            }
            System.out.println(apartment[k][n]);
        }
    }
}
