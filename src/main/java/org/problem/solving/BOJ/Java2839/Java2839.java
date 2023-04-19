package org.problem.solving.BOJ.Java2839;

import java.util.Scanner;

public class Java2839 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = N/5; i >= 0; i--) {
            for (int j = 0; j <= N/3; j++) {
                if (N==5*i + 3*j){
                    System.out.println(i+j);
                    return;
                }
            }
        }
        System.out.println(-1);
    }
}
