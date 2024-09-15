package org.problem.solving.BOJ.Java28236;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Java28236 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] arr = new int[k+1];
        int min = Integer.MAX_VALUE;
        int ans = Integer.MAX_VALUE;
        for (int i = 1; i <= k; i++) {
            st = new StringTokenizer(br.readLine());
            int f = Integer.parseInt(st.nextToken()); // f
            int d = Integer.parseInt(st.nextToken()); // d
            arr[i] = (f-1) + (m+1)-d;
            if (arr[i] < min){
                min = arr[i];
                ans = i;
            }
        }
        System.out.println(ans);
    }
}