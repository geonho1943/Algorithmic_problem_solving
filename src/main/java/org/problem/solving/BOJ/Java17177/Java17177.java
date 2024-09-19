package org.problem.solving.BOJ.Java17177;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Java17177 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int c = Integer.parseInt(input[2]);
        int q = 2 * b * c;
        int r = a * (c*c - a*a + b*b);
        int d = q*q - 4* a *r;
        if(d < 0) {
            System.out.println(-1);
            return;
        }
        double x = (-q + Math.sqrt(d)) / (2* a);
        if(x < 0) {
            System.out.println(-1);
            return;
        }
        System.out.println((int)(x + 1e-5));
    }
}