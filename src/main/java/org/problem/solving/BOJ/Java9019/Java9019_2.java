package org.problem.solving.BOJ.Java9019;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Java9019_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            // HashMap을 사용하여 방문 여부 체크 및 경로 저장
            Map<Integer, String> ans = new HashMap<>();
            Map<Integer, Boolean> visited = new HashMap<>();
            Queue<Integer> queue = new LinkedList<>();
            queue.add(A);
            ans.put(A, "");
            visited.put(A, true);

            while (!queue.isEmpty()) {
                int beforNum = queue.poll();

                if (beforNum == B) {
                    System.out.println(ans.get(B));
                    break;
                }

                int D = (2 * beforNum) % 10000;
                int S = beforNum == 0 ? 9999 : beforNum - 1;
                int L = (beforNum % 1000) * 10 + beforNum / 1000;
                int R = (beforNum % 10) * 1000 + beforNum / 10;

                if (!visited.getOrDefault(D, false)) {
                    queue.add(D);
                    visited.put(D, true);
                    ans.put(D, ans.get(beforNum) + "D");
                }
                if (!visited.getOrDefault(S, false)) {
                    queue.add(S);
                    visited.put(S, true);
                    ans.put(S, ans.get(beforNum) + "S");
                }
                if (!visited.getOrDefault(L, false)) {
                    queue.add(L);
                    visited.put(L, true);
                    ans.put(L, ans.get(beforNum) + "L");
                }
                if (!visited.getOrDefault(R, false)) {
                    queue.add(R);
                    visited.put(R, true);
                    ans.put(R, ans.get(beforNum) + "R");
                }
            }
        }
    }
}