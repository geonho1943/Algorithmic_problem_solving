package org.problem.solving.BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Java10807 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int input = Integer.parseInt(st.nextToken());
            if (map.get(input) == null) {
                map.put(input, 1);
            } else {
                map.replace(input, map.get(input) + 1);
            }
        }

        int v = Integer.parseInt(br.readLine());
        if (map.get(v) == null)
            System.out.println(0);
        else
            System.out.println(map.get(v));
    }

}
