package org.problem.solving.BOJ.Java2738;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Java2738 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(sc.nextLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] sum = new int[n][m];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(sc.nextLine());
            for (int j = 0; j < m; j++) {
                sum[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(sc.nextLine());
            for (int j = 0; j < m; j++) {
                sum[i][j] += Integer.parseInt(st.nextToken());
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
    }
}
