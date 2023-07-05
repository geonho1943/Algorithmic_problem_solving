package org.problem.solving.BOJ.Java1107;

import java.util.Scanner;

public class Javatest {
    public static void main(String[] args)  {
        Scanner scan = new Scanner(System.in);

        int channel = scan.nextInt();
        int brokenBtnNum = scan.nextInt();

        boolean[] brokenBtnArray = new boolean[10];
        for(int i = 0; i < brokenBtnNum; i++) {
            int n = scan.nextInt();
            brokenBtnArray[n] = true;
        }

        int result = Math.abs(channel - 100); //초기값 설정
        for(int i = 0; i <= 999999; i++) {
            String tempNum = String.valueOf(i);
            int len = tempNum.length();

            boolean impossibleNum = false;
            for(int j = 0; j < len; j++) {
                if(brokenBtnArray[tempNum.charAt(j) - '0']) { //고장난 버튼을 눌러야 하면
                    impossibleNum = true;
                    break; //더 이상 탐색하지 않고 빠져나온다.
                }
            }
            if(!impossibleNum) { //i를 누를때 고장난 버튼을 누르지 않는다면
                int min = Math.abs(channel - i) + len; //i를 누른 후(len) target까지 이동하는 횟수(channel - i)
                result = Math.min(min, result);
            }
        }
        System.out.println(result);
    }
}
