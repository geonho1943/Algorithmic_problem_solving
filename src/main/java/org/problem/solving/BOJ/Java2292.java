package org.problem.solving.BOJ;

import java.util.Scanner;

public class Java2292 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int count = 1; // 겹 수(최소 루트)
        int range = 2;	// 범위 (최솟값 기준)

        if (N == 1) {
            System.out.print(1);
        }

        else {
            while (range <= N){
                range += (6 * count);
                count++;
            }
            System.out.print(count);
        }
    }
}