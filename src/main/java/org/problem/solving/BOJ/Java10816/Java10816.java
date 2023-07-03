package org.problem.solving.BOJ.Java10816;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Java10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<Integer,Integer> cardMap = new HashMap<>();

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int cardNum =Integer.parseInt(st.nextToken());
            int count = cardMap.getOrDefault(cardNum,0);
            cardMap.put(cardNum,count+1);
        }
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (cardMap.get(num)==null) cardMap.put(num,0);
            sb.append(cardMap.get(num)+ " ");
        }
        System.out.println(sb);
    }
}
