package org.problem.solving.BOJ.Java14916;
import java.util.Scanner;

public class Java14916ChatGpt {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        long startTime = System.nanoTime(); // 시작 시간 체크

        int count = 0;

        while (n > 0) {
            // 5원짜리로 거슬러 줄 수 있을 때
            if (n % 5 == 0) {
                count += n / 5;
                n = 0;
            } else {
                // 5원짜리로 거슬러 줄 수 없을 때 2원짜리를 사용
                n -= 2;
                count++;

                // 거스름돈이 음수가 되면 거슬러 줄 수 없는 경우
                if (n < 0) {
                    count = -1;
                    break;
                }
            }
        }
        System.out.println("ChatGPT의 O(N) 코드");
        System.out.println(count);
        long endTime = System.nanoTime(); // 종료 시간 체크
        long executionTime = endTime - startTime; // 실행 시간 계산 (나노초 단위)
        System.out.println("실행 시간: " + executionTime+" ns");
    }
}

//chatGPT가 짠 코드