package org.problem.solving.BOJ.Java1969;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Java1969 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        List<String> DNA = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            DNA.add(br.readLine());
        }
        int sum = 0;
        for (int i = 0; i < M; i++) {
            int A = 0, T = 0, G = 0, C = 0;
            for (int j = 0; j < N; j++) {
                char temp =DNA.get(j).charAt(i);
                switch (temp){
                    case 'A': A++; break;
                    case 'T': T++; break;
                    case 'G': G++; break;
                    case 'C': C++; break;
                }
            }
            int max = Math.max(A, Math.max(T, Math.max(G,C)));
            sum += N-max;
            if (max == A){
                sb.append('A');
            } else if (max == C) {
                sb.append('C');
            } else if (max == G) {
                sb.append('G');
            } else {
                sb.append('T');
            }
        }
        System.out.println(sb);
        System.out.println(sum);
    }
}