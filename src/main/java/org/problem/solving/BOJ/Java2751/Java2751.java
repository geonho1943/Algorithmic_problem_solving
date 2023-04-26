package org.problem.solving.BOJ.Java2751;

import java.io.*;
import java.util.Arrays;
//array + arrays.sort() + bufferedReader + bufferedWeiter
public class Java2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        br.close();
        Arrays.sort(arr);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < N; i++) {
            bw.write(arr[i]+"\n");
        }
        bw.flush();
        bw.close();
    }
}
