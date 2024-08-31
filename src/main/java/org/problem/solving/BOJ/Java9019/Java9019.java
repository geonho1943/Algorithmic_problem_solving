package org.problem.solving.BOJ.Java9019;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Java9019 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            String[] ans = new String[10000]; // 계산한 결과값을 인덱스로 사용함 ex: L> 2341 이라면 ans[2341] 에 "L"을 추가함
            boolean[] visited = new boolean[10000];
            Queue<Integer> queue = new LinkedList<>();
            queue.add(A);
            ans[A] = "";// 필요 없을듯
            while (!queue.isEmpty()){
                int beforNum = queue.poll();
                visited[beforNum]=true;
                if (beforNum == B){
                    System.out.println(ans[B]);
                    break;
                }
                int D = (2 * beforNum) % 10000;
                // n을 두배로 바꾸고 10000으로 나눈 나머지
                int S = beforNum == 0 ? 9999 : beforNum - 1;
                // 0일 때, 9999, 아니면 1을 빼준다
                int L = (beforNum % 1000) * 10 + beforNum / 1000;
                // 1234 -> 2341 : 1234를 1000으로 나눈 나머지(234)에 10을 곱함=2340, 1234를 1000으로 나누면 1, 2340+1=2341
                int R = (beforNum % 10) * 1000 + beforNum / 10;
                // 1234 -> 4123 : 비슷함

                if (!visited[D]){
                    queue.add(D);
                    visited[D]=true;
                    ans[D] = ans[beforNum]+ "D";
                }
                if (!visited[S]){
                    queue.add(S);
                    visited[S]=true;
                    ans[S] = ans[beforNum]+ "S";
                }
                if (!visited[L]){
                    queue.add(L);
                    visited[L]=true;
                    ans[L] = ans[beforNum]+ "L";
                }
                if (!visited[R]){
                    queue.add(R);
                    visited[R]=true;
                    ans[R] = ans[beforNum]+ "R";
                }

            }
        }
    }
}