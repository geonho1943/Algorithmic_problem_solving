package org.problem.solving.BOJ.Java2751;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Java2751_SB {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(Integer.valueOf(br.readLine()));
        }
        br.close();
        Collections.sort(list);
        StringBuilder sb = new StringBuilder();
        for(int value : list) {
            sb.append(value).append('\n');
        }
        System.out.println(sb);
    }
}
