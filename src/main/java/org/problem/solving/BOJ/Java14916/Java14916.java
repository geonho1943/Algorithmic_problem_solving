package org.problem.solving.BOJ.Java14916;
import java.util.Scanner;

public class Java14916 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int coin = sc.nextInt();
        sc.close();
        long startTime = System.nanoTime(); // 시작 시간 체크
        int coin2 = coin % 5;
        int coin5 = coin/5;
        int coin5ans=0;//5원 동전의 갯수
        int coin2ans=0;//2원 동전의 갯수

        if (coin==1 || coin ==3) { //예외처리
            System.out.println(-1);
            return;
        }else if (coin ==2 ) {
            System.out.println(1);
            return;
        }else if (coin ==4) {
            System.out.println(2);
            return;
        }
        switch (coin2){
            case 0:
                coin2ans=0;
                coin5ans=coin5;
                break;
            case 1:
                coin2ans=3;
                coin5ans=coin5-1;
                break;
            case 2:
                coin2ans=1;
                coin5ans=coin5;
                break;
            case 3:
                coin2ans=4;
                coin5ans=coin5-1;
                break;
            case 4:
                coin2ans=2;
                coin5ans=coin5;
                break;
        }
        System.out.println("내가 작성한 O(1) 코드");
        System.out.println(coin5ans+coin2ans);
        long endTime = System.nanoTime(); // 종료 시간 체크
        long executionTime = endTime - startTime; // 실행 시간 계산 (나노초 단위)
        System.out.println("실행 시간: " + executionTime+" ns");
    }
}

//내가 짠 코드
