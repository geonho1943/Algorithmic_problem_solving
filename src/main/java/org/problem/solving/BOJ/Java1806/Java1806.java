package org.problem.solving.BOJ.Java1806;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Java1806 {
    // 투 포인터 사용, 가장 짧은 구간 합이 S 이상 일 경우만 체크
    // 피벗을 양 끝쪽에서 시작 5,8 중 더 작은 값을 제거 : 8
    // 5 1 3 5 10 7 4 9 10 8 = 54 초기 값
    // + + + +  + + + + + - = 46  > 구간합이 S보다 작을때 이전 길이를 출력
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        int arrSum = 0;
        for (int i = 0; i < N; i++){
            int temp = Integer.parseInt(st.nextToken());
            arr[i] = temp;
            arrSum += temp;
        }
        if (arrSum < S) {
            System.out.println(0);
            return; // 만족하는 합을 만들 수 없는 경우
        }
        int startPivot = 0;
        int endPivot = N-1;
        int currentLength = N;
        int minLength = Integer.MAX_VALUE;
        while (startPivot != endPivot || arrSum > S){ // 피벗이 겹치거나 합이 작아질때
            if (arr[startPivot] > arr[endPivot] ){
                arrSum -= arr[endPivot];
                endPivot--;
                currentLength --;
            }else {
                arrSum -= arr[startPivot];
                startPivot++;
                currentLength --;
            }
            if (arrSum > S){
                minLength = currentLength;
            }
        }
        System.out.println(minLength);
    }
}
