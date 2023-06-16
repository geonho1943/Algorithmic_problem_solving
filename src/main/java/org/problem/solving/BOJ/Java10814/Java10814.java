package org.problem.solving.BOJ.Java10814;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Java10814 {
    public static void main(String[] args) throws IOException {
        Comparator<String[]> customCom = new Comparator<String[]>() {//오버라이딩한 메서드를 사용
            @Override
            public int compare(String[] o1, String[] o2) {
                return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
            }
        };

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[][] arr = new String[N][2];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            arr[i][0] = st.nextToken(); // 나이
            arr[i][1] = st.nextToken(); // 이름
        }

        Arrays.sort(arr, customCom);
        for (int i = 0; i < N; i++)
            System.out.println(arr[i][0] + " " + arr[i][1]);
    }
}

