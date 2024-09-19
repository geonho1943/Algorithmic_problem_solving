package org.problem.solving.BOJ.Java10039;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Java10039 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            int temp = Integer.parseInt(br.readLine());
            sum += Math.max(temp, 40);
        }
        System.out.println(sum/5);
    }
}
