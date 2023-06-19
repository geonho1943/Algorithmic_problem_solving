package org.problem.solving.BOJ.Java9012;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Java9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        char charA = '(';
        char charB = ')';
        int aNum;
        int bNum;
        for (int i = 0; i < T; i++) {
            aNum = 0;
            bNum = 0;
            String PS =br.readLine();
            for (int j = 0; j < PS.length(); j++) {
                if (PS.charAt(j)==charA){
                    aNum++;
                } else if (PS.charAt(j)==charB) {
                    bNum++;
                }else System.out.println("Error: 문자열의 인덱스범위 오류 혹은 입력값 형변환 오류");
            }
//            if (aNum%2 ==0 && bNum%2 ==0) System.out.println("YES");
            if (aNum == bNum) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
