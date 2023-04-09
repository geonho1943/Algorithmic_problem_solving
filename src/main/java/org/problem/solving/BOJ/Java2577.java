package org.problem.solving.BOJ;
//쉬운문제인데 최적화 해본다고 변수 줄이고 구조바꾼다고 오래걸림..

import java.util.Scanner;

public class Java2577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sum = String.valueOf(sc.nextInt()*sc.nextInt()*sc.nextInt());//다 더하기
        sc.close();

        for (int i=0; i<=9; i++){//0~9까지
            int temp =0;
            for (int j=0; j<sum.length();j++){//비교할 sum의 1번째 숫자부터 마지막까지
                if (i == sum.charAt(j)-48){//chatAt()이 아즈키로 뱉어서 -48 해줌
                    temp++;
                }
            }
            System.out.println(temp);
        }
    }
}