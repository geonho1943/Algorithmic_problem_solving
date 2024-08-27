package org.problem.solving.BOJ.Java5430;

import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Java5430 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String commands = br.readLine();
            int n = Integer.parseInt(br.readLine());
            String arrayInput = br.readLine();

            Deque<String> deque = new LinkedList<>();
            arrayInput = arrayInput.substring(1, arrayInput.length() - 1); // 대괄호 제거
            if (n > 0) {
                StringTokenizer st = new StringTokenizer(arrayInput, ",");
                while (st.hasMoreTokens()) {
                    deque.add(st.nextToken());
                }
            }

            boolean isReversed = false;
            boolean isError = false;

            for (int j = 0; j < commands.length(); j++) {
                char command = commands.charAt(j); // 현재 명령어를 가져옴
                if (command == 'R') {
                    isReversed = !isReversed; // 뒤집기 상태 반전
                } else if (command == 'D') {
                    if (deque.isEmpty()) {
                        isError = true; // 비어있으면 에러
                        break;
                    }
                    if (isReversed) {
                        deque.pollLast(); // 뒤집힌 상태라면 뒤에서 제거
                    } else {
                        deque.pollFirst(); // 일반 상태라면 앞에서 제거
                    }
                }
            }

            // 결과 출력
            if (isError) {
                System.out.println("error");
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("[");
                while (!deque.isEmpty()) {
                    if (isReversed) {
                        sb.append(deque.pollLast());
                    } else {
                        sb.append(deque.pollFirst());
                    }
                    if (!deque.isEmpty()) {
                        sb.append(",");
                    }
                }
                sb.append("]");
                System.out.println(sb.toString());
            }
        }
    }
}