package org.problem.solving.BOJ.Java1806;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Java1806_2 {
    // L,R 0 에서 시작, 부분합이 S이상 일 때 까지 길이추가 (R),
    // 길이 만족하면 (L) 이동하면서 S만족하는 최소길이 구하기
    // 이러면 _1 에서 케치 못 하는 범위 탐색 가능
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int pivotL = 0;
        int pivotR = 0;
        int currentSum = 0;
        int minLength = Integer.MAX_VALUE;
        while (pivotL < N && pivotR < N){
            if (currentSum >= S){
                if (minLength > pivotR - pivotL){
                    minLength = pivotR - pivotL;
                }
                currentSum -= arr[pivotL++];
            } else {
                currentSum += arr[pivotR++];
            }
        }
        while (currentSum >= S){
            if (minLength > pivotR - pivotL){
                minLength = pivotR - pivotL;
            }
            currentSum -= arr[pivotL];
            pivotL++;
        }
        System.out.println(minLength == Integer.MAX_VALUE ? 0 : minLength);
    }
}