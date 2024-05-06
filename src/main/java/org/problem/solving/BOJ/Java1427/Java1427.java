package org.problem.solving.BOJ.Java1427;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Java1427 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String num = String.valueOf(sc.nextInt());
        int[] arr = new int[num.length()];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= num.charAt(i)-48;
        }
        Arrays.sort(arr);
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
    }
}
