package org.problem.solving.BOJ.Java9461;

import java.util.Scanner;

public class Java9461Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = Integer.parseInt(sc.nextLine());
        long[] arr = new long[105];
        int[] inputArray = {1, 1, 1, 2, 2, 3, 4, 5, 7, 9};
        for (int i = 0; i < inputArray.length; i++) {
            arr[i] = inputArray[i];
        }
        for (int i  = 0; i < testCase; i++) {
            int p = Integer.parseInt(sc.nextLine())-1;
            if (p < 10){
                System.out.println(arr[p]);
            } else {
                for (int j = 10; j <= p; j++) {
                    long temp = arr[j-2] + arr[j-3];
                    arr[j] = temp;
                }
                System.out.println(arr[p]);
            }
        }
    }
}
