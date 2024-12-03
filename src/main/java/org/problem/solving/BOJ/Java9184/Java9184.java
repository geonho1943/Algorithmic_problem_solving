package org.problem.solving.BOJ.Java9184;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Java9184 {
    static int[][][] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        dp = new int[21][21][21];
        while (true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            if (a == -1 && b == -1 && c == -1) break;
            System.out.println( "w(" + a + ", " + b + ", " + c + ") = " + w(a,b,c));
            // w(1, 1, 1) = 2
        }
    }
    private static int w(int a, int b, int c){
        if (ifSafe(a) && ifSafe(b) && ifSafe(c) && dp[a][b][c] != 0) return dp[a][b][c];

        //if a <= 0 or b <= 0 or c <= 0, then w(a, b, c) returns:
        //    1
        if (a <= 0 || b <= 0 || c <= 0) return 1;

        //if a > 20 or b > 20 or c > 20, then w(a, b, c) returns:
        //    w(20, 20, 20)
        if (a > 20 || b > 20 || c > 20) return dp[20][20][20] = w(20, 20, 20);

        //if a < b and b < c, then w(a, b, c) returns:
        //    c
        if (a < b && b < c) return dp[a][b][c] = w(a, b, c-1) + w(a, b-1, c-1) - w(a, b-1, c);

        //otherwise it returns:
        //    w(a-1, b, c) + w(a-1, b-1, c) + w(a-1, b, c-1) - w(a-1, b-1, c-1)
        return dp[a][b][c] = w(a-1, b, c) + w(a-1, b-1, c) + w(a-1, b, c-1) - w(a-1, b-1, c-1);
    }

    private static boolean ifSafe(int num) {
        return num >= 0 && num < 21;
    }
}