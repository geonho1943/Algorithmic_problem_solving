package org.problem.solving.BOJ.Java2668;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Java2668 {
    // 1 > 3 > 5 > 1 의 경우 대응하지 못함
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int ans = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
//            int temp = arr[i+1];
            if (arr[arr[i]-1] == i+1){
                ans++;
                sb.append(i+1+"\n");
            }
        }
        System.out.println(ans);
        System.out.println(sb);

    }
}
