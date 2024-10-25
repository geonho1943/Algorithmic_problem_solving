package org.problem.solving.BOJ.Java2467;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Java2467 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int left = 0;
        int right = N-1;
        int conver0 = Integer.MAX_VALUE;
        int leftAns = 0;
        int rightAns = 0;
        while(left < right){
            int temp = arr[left] + arr[right];
            if (Math.abs(temp) < Math.abs(conver0)){
                conver0 = temp;
                leftAns = arr[left];
                rightAns = arr[right];
            }
            if (temp < 0) left++;
            else right--;
        }
        System.out.println(leftAns +" "+rightAns);
    }
}