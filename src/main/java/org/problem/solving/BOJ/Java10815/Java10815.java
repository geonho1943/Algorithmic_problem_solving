package org.problem.solving.BOJ.Java10815;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Java10815 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(Integer.valueOf(st.nextToken()));
        }
        int m = Integer.parseInt(br.readLine());
//        int[] array = new int[m];
        st = new StringTokenizer(br.readLine());
//        for (int i = 0; i < m; i++) {
//            array[i] = Integer.parseInt(st.nextToken());
//        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {

            if (set.contains(Integer.parseInt(st.nextToken()))) {
                sb.append("1 ");
            }else sb.append("0 ");
        }
        System.out.println(sb);
    }
}




//5
//6 3 2 10 -10
//8
//10 9 -5 2 3 4 5 -10