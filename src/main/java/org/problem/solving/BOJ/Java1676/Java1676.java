package org.problem.solving.BOJ.Java1676;

import java.util.Scanner;

public class Java1676 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int x5 = N/5;
        int x25 = N/25;
        int x125 = N/125;
        System.out.println(x5+x125+x25);
    }
}