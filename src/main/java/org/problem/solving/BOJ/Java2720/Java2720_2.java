package org.problem.solving.BOJ.Java2720;

import java.util.Scanner;

public class Java2720_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = Integer.parseInt(sc.nextLine());
        int[] coins = {25, 10, 5, 1}; // 각 코인의 가치를 배열에 저장

        for (int i = 0; i < tc; i++) {
            int change = Integer.parseInt(sc.nextLine());

            for (int j = 0; j < coins.length; j++) {
                int coinCount = change/coins[j];
                change %= coins[j]; // 남은 잔돈 계산
                System.out.print(coinCount + " ");
            }
            System.out.println();
        }

    }
}
