package org.problem.solving.BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//어떤 양의 정수 X의 각 자리가 등차수열을 이룬다면, 그 수를 한수라고 한다.
// 등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다. N이 주어졌을 때,
// 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오.
//
//입력
//첫째 줄에 1,000보다 작거나 같은 자연수 N이 주어진다.
//
//출력
//첫째 줄에 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력한다.
public class Java1065 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        br.close();
        System.out.println(myCunt(num));
    }

    public static int myCunt(int num){
        int cunt=0;
        for (int i=1;i<=num;i++) {
            if (i <= 99) {
                cunt++;
            }
            if (i > 99) {
                int n1 = i / 100;
                int n2 = (i / 10) % 10;
                int n3 = i % 10;
                int fnum = n1 - n2;
                int snum = n2 - n3;

                if (fnum == snum) {
                    cunt++;
                }

            }
        }
        return cunt;
    }
}
