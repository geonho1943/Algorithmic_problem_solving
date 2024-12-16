package org.problem.solving.BOJ.Java12852;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Java12852 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        sb.append(n);
        int count = 0;
        while (n > 1){
            if (n%3 == 0) {
                n/=3;
                count++;
            } else if (n%2 == 0) {
                n/=2;
                count++;
            } else {
                n--;
                count++;
            }
            sb.append(" " + n);
        }
        System.out.println(count);
        System.out.println(sb);
    }
}
// 아 가장 적은 횟수 였네..