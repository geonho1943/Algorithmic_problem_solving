package org.problem.solving.BOJ.Java1929;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Java1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        boolean dec;
        for (int i = M; i <= N; i++) {
            dec = true;
            if (i <= 1) break;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    dec = false;
                    break;
                }
            }
            if (dec) sb.append(i).append("\n");
        }
        System.out.println(sb);
    }
}
