package org.problem.solving.BOJ.Java2750;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Java2750_insertSort {
    static int N;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        insertSort(arr);
        outPut(arr);
    }

    private static void outPut(int[] arr) {
        for (int i = 0; i < N; i++) System.out.println(arr[i]);
    }

    private static void insertSort(int[] arr) {
        for (int i = 1; i < N; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
}
