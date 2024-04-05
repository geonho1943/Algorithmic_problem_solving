package org.problem.solving.BOJ.Java1316;

import java.util.Scanner;

public class Java1316 {
    public static boolean isGroupWord(String word) {
        boolean[] vis = new boolean[26];// 알파벳
        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);
            if (vis[currentChar - 'a']) { // 이미방문했을떄
                if (i > 0 && word.charAt(i - 1) != currentChar) {
                    return false; // 연속하지 않은 경우
                }
            } else {
                vis[currentChar - 'a'] = true;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // 단어의 개수 N 입력
        scanner.nextLine(); // 개행 문자 처리

        int count = 0; // 그룹 단어의 개수를 세는 변수
        for (int i = 0; i < N; i++) {
            String word = scanner.nextLine(); // 단어 입력
            if (isGroupWord(word)) {
                count++; // 그룹 단어인 경우 카운트 증가
            }
        }
        System.out.println(count); // 결과 출력
        scanner.close();
    }
}