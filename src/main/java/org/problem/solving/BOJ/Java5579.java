package org.problem.solving.BOJ;

import java.util.Scanner;


//x대학의 m교수님은 프로그래밍학습중..
//30명의 학생중 28 명이 제출 함
// 나머지 2명의 출석번호를 구하시오
// 작은 번호를 먼저 구하고 그다음 출석번호를 구하시오

//30명의 출번을 arr에 기록 한다
//1부터 30까지의 행렬을 준비한다
//거기에 arr의 출번을 그 출번값의 자리에 입력 한다
//그값의 빈 자리를 구한다면?
// 별로 안좋은 알고리즘

public class Java5579 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] stud  = new int[30];

        for (int i=0; i<28;i++){
            stud[sc.nextInt()-1] =1;
        }
        sc.close();
        for (int i=0; i<30;i++){
            if (stud[i] == 0){
                System.out.println(i+1);
            }
        }

    }
}

