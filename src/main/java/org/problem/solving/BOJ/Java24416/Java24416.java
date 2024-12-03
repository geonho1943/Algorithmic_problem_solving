package org.problem.solving.BOJ.Java24416;
import java.util.Scanner;

public class Java24416 {
    static int count =0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        fib(N);
        System.out.println(count);
        count = 0;
        dpFib(N);
        System.out.println(count);
    }

    // 재귀 함수로 구현
    private static int fib(int n){
        if (n == 1 || n == 2){
            count++;
            return 1;
        }
        else return fib(n-1) + fib(n-2);
    }

    // dp로 구현
    private static int dpFib(int n){
        int[] arr = new int[n];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < n; i++) {
            arr[i] = arr[i-1] + arr[i-2];
            count++;
        }
        return arr[n-1];
    }
}