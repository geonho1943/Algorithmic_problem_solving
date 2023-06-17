package org.problem.solving.BOJ.Java11047;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Java11047 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st =new StringTokenizer(br.readLine()," ");
        int n = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        br.close();
        int count=0;
        while(n>0){
            if (K >= arr[n-1]){//K > arr[n-1] 라고 해서 시행착오가 있었음
                count+= K/arr[n-1];
                K %= arr[n-1];
            }
            n--;
        }
        System.out.println(count);
    }
}

