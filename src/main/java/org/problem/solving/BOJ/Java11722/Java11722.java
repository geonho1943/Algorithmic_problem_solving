package org.problem.solving.BOJ.Java11722;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//dp, 바텀업, dp테이블 사용
public class Java11722 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int[] dpTable = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        dpTable[0]=1;
        //배열의 값이 1개일경유 가장작은 배열의 길이는 1이기 때문에 1 기입
        for (int i = 1; i < n; i++) {
            dpTable[i]=1;
            for (int j = 0; j < i; j++) {
                if (arr[i] < arr[j]){
                    //i를 기준으로 j 값들로 크기를 비교
                    if (dpTable[i] <= dpTable[j]){
                        //가장 긴 배열의 값에 자신의 길이 1 을 더해 가장 긴 배열의 실시간 상태를 갱신함
                        dpTable[i] = dpTable[j]+1;
                    }
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans = Math.max(ans,dpTable[i]);
        }
        System.out.println(ans);
    }
}
