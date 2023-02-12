package org.problem.solving.BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// DP 입문문제라고함 피보나치2
// n 번째 값을 구해 n = < 90
// 0 1 2 3 4 5 6 7  8  9 index pbnc
// 0 1 1 2 3 5 8 13 21 34

public class Java2748 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();
        Long[] arr = new Long[n+1];
        arr[0]= Long.valueOf(0);
        arr[1]= Long.valueOf(1);
        for (int i=2; i<arr.length; i++){
            arr[i]=arr[i-1]+arr[i-2];
        }
        System.out.println(arr[n]);
    }
}
