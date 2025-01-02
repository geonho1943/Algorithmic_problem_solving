package org.problem.solving.BOJ.Java6503;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Java6503_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n;
        String str;
        Queue<Character> que;
        Map<Character, Integer> charMap;
        while (true) {
            n = Integer.parseInt(br.readLine());
            if (n == 0) break;

            str = br.readLine();
            que = new LinkedList<>(); // 순서 체크용 (투포인터를 대신 함)
            charMap = new HashMap<>(); // 중복 문자의 갯수 체크용, 문자의 갯수 ( 탐색 시간을 감소시킴)
            int maxAns = 0;

            for (int i = 0; i < str.length(); i++) {
                char curr = str.charAt(i);

                // 탐색할 문자 큐에 추가
                que.offer(curr);

                // map에 있으면 갱신, 없으면 추가
                if (charMap.containsKey(curr)) {
                    charMap.put(curr, charMap.get(curr) + 1);
                } else {
                    charMap.put(curr, 1);
                }

                // char 종류가 n 개를 넘으면 큐 기준 제거
                while (charMap.size() > n) {
                    char removedChar = que.poll();
                    charMap.put(removedChar, charMap.get(removedChar) - 1);

                    // 개수가 0이 되면 Map에서 없에야 함
                    if (charMap.get(removedChar) == 0) {
                        charMap.remove(removedChar);
                    }
                }
                // 최대 길이 갱신
                maxAns = Math.max(maxAns, que.size());
            }
            sb.append(maxAns).append("\n");
        }
        System.out.print(sb);
    }
}