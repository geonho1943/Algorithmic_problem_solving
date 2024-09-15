package org.problem.solving.BOJ.Java32025;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Java32025 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int min = Integer.parseInt(br.readLine());
        min = Math.min(min,Integer.parseInt(br.readLine()))*50;
        System.out.println(min);
    }
}