package org.problem.solving.BOJ.Java6503;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Java6503 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String input = br.readLine();
            int n = Integer.parseInt(input);
            if (n == 0) break;

            String str = br.readLine();
            Set<Character> charSet = new HashSet<>();
            int start = 0, end = 0, maxLength = 0;

            // 탐색 시작
            while (end < str.length()) {
                char currentChar = str.charAt(end++); //계속해서 다음 문자 탐색

                charSet.add(currentChar); // 중복 상관 없음

                if (charSet.size() > n){ // 문제의 부분
                    char aim = str.charAt(start);
                    charSet.remove(aim);
                    int curr = start;
                    while (curr < end){
                        if (aim == str.charAt(curr)){
                            start++;
                        }
                        curr++;
                    }
//                    while (str.charAt(start) == str.charAt(start-1)) { // 제거 되었던 문자랑 같으면 또 제거
//                        start++;
//                    }
                }

                // 최대 길이 갱신
                maxLength = Math.max(maxLength, end - start);

//                for (int i = start; i < end; i++) {
//                    System.out.print(str.charAt(i));
//                }
//                System.out.println("\n" + maxLength);
            }

            sb.append(maxLength).append("\n");
        }

        // 결과 출력
        System.out.print(sb);
    }
}