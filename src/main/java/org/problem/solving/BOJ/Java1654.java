package org.problem.solving.BOJ;
//이분 탐색
import java.util.Arrays;
import java.util.Scanner;

public class Java1654 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        sc.nextLine();
        int[] arr = new int[k];
        long max=0;
        for (int i = 0; i < k; i++) {
            arr[i] = sc.nextInt();
            if(max < arr[i]) {
                max = arr[i];
            }
        }
        max ++;
        long min = 0;
        long mid = 0;
        while (min < max) {
            long count = 0;
            mid = (min + max) / 2;
            for (int i = 0; i < k; i++) { //계산 하기
                count += arr[i] / mid;
            }
            if (count < n) { //원하느 갯수보다 적으면 mid 조정 하기
                max = mid ; //
            } else { // n 이상인 경우
                min = mid + 1;
            }
        }
        System.out.println(mid-1);
    }
}