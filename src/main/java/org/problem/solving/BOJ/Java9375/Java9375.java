package org.problem.solving.BOJ.Java9375;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Java9375 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            int M = Integer.parseInt(br.readLine());
            Map<String,Integer> map = new HashMap<>();
            for (int j = 0; j < M; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine(), " ");
                st.nextToken();
                String option = st.nextToken();
                map.put(option,map.getOrDefault(option, 0) + 1);
            }
            int ans = 1;
            for (int val : map.values())
                ans *= val + 1;
            System.out.println(ans - 1);
        }
    }
}