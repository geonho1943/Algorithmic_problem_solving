package org.problem.solving.BOJ.Java2750;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Java2750_selectSort {
    static int N;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        selectSort(arr);
        outPut(arr);
    }

    private static void outPut(int[] arr) {
        for (int i = 0; i < N; i++) System.out.println(arr[i]);
    }

    private static void selectSort(int[] arr) {
        int tempIndex;
        for (int i = 0; i < N; i++) {
            tempIndex = i;
            for (int j = i; j < N ; j++) {
                if (arr[j] < arr[tempIndex]){
                    tempIndex = j;
                }
            }
            if (i != tempIndex){
                int temp = arr[i];
                arr[i] = arr[tempIndex];
                arr[tempIndex] = temp;
            }
        }
    }

}
