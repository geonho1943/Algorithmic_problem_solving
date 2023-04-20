package org.problem.solving.BOJ.Java2869;

import java.util.Scanner;

public class Java2869 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int V = sc.nextInt();
        if ((V-B)%(A-B)==0)System.out.println((V-B)/(A-B));
        else System.out.println((V-B)/(A-B)+1);
    }
}
