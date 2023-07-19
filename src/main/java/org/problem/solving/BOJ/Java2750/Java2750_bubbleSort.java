package org.problem.solving.BOJ.Java2750;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Java2750_bubbleSort {
    static int N;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        bubbleSort(arr);
        outPut(arr);
    }

    private static void outPut(int[] arr) {
        for (int i = 0; i < N; i++) System.out.println(arr[i]);
    }

    private static void bubbleSort(int[] arr) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N-1; j++) {
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

}
