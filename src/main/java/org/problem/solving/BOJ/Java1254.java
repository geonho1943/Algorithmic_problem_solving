package org.problem.solving.BOJ;

import java.util.*;
import java.io.*;
//미해결.....
public class Java1254 {

    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();

    static void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stt = null;

        String str = br.readLine().trim();
        sb = new StringBuilder(str);

        int N = str.length();

        for(int i = 0; i < N; i++) {
            sb = new StringBuilder(str.substring(i));
            String s = sb.toString();
            String rs = sb.reverse().toString();
            if(s.equals(rs)) {
                print(N+i);
                return;
            }
        }

        br.close();
        bw.close();
    }
    public static void main(String[] args) throws IOException {
        solve();
    }
    static void print(int opih) { System.out.println(opih); }
}