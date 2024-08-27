package org.problem.solving.BOJ.Java6064;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Java6064 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int M = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            int X = Integer.parseInt(st.nextToken())-1;
            int Y = Integer.parseInt(st.nextToken())-1;
            boolean temp = false;
            for (int j = X; j <= M * N; j += M) {
                if (j%N == Y) {
                    System.out.println(j+1);
                    temp = true;
                    break;
                }
            }
            if (!temp) System.out.println(-1);
        }
    }
}


//3
//10 12 3 9
//10 12 7 2
//13 11 5 6