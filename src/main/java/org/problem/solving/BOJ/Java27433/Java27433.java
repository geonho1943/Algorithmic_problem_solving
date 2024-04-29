package org.problem.solving.BOJ.Java27433;

import java.util.Scanner;

public class Java27433 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(recersive(n));
    }
    private static long recersive(int n) { // 반환 타입을 long으로 변경
        if (n<=1) return 1;
        else return n*recersive(n-1);
    }
}
