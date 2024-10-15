package org.problem.solving.BOJ.Java14551;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Java14551 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int ans = 1;
        for (int i = 0; i < N; i++) {
            int a = Integer.parseInt(br.readLine());
            if (a == 0) a = 1; // 카드가 없으면 한세트 주기때문에 1
            ans = (ans * a)%M;
            // 최악의 경우 200개의 0이 사용된 정수가 저장될수 있어서
            // M의 나머지값을 저장 해야 함
        }
        System.out.println(ans%M);
    }
}