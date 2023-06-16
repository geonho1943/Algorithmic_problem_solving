package org.problem.solving.BOJ.Java4796;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Java4796 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int i = 1;
        while (true) {
            st = new StringTokenizer(br.readLine());
            int L = Integer.parseInt(st.nextToken());
            int P = Integer.parseInt(st.nextToken());
            int V = Integer.parseInt(st.nextToken());
            if (L+P+V ==0) break;

            int total = L * (V / P) + Math.min(L, V % P);
            sb.append("Case " + i + ": " + total + "\n");
            i++;
        }
        System.out.print(sb);
    }
}