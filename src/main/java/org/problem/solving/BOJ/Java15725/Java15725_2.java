package org.problem.solving.BOJ.Java15725;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Java15725_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        if (input.charAt(0) == 'x') {
            System.out.println(1);
            return;
        } else if (input.charAt(0) == '-' && input.charAt(1) == 'x') {
            System.out.println(-1);
            return;
        }
        int x = input.indexOf('x');
        if (x == -1) {
            System.out.println(0);
            return;
        }
        StringBuilder ans = new StringBuilder();
        for (int i = x - 1; i >= 0; i--) {
            if (input.charAt(i) == '+' || input.charAt(i) == '-') {
                ans.insert(0, input.charAt(i));
                break;
            }
            ans.insert(0, input.charAt(i));
        }
        System.out.println(ans);
    }
}