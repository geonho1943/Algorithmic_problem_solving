package org.problem.solving.BOJ.Java11726;

import java.util.Scanner;

public class Java11726 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N+1];
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;
        for (int i = 3; i <= N; i++) {
            arr[i] =(arr[i-1]+arr[i-2])%10007;
        }
        System.out.println(arr[N]);
    }
}
