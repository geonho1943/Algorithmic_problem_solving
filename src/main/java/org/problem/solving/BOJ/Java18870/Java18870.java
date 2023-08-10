package org.problem.solving.BOJ.Java18870;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Java18870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int[] arrSort = new int[N];
        StringTokenizer st  = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int temp = Integer.parseInt(st.nextToken());
            arr[i] = temp;
            arrSort[i] = temp;

        }

        HashMap<Integer,Integer> newArr = new HashMap<>();
        Arrays.sort(arrSort);
        int num = 0;
        for (int value: arrSort){
            if (!newArr.containsKey(value)){
                newArr.put(value,num);
                num++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int key : arr) {
            int asd = newArr.get(key);
            sb.append(asd);
            sb.append(' ');
        }
        System.out.println(sb);

    }
}
