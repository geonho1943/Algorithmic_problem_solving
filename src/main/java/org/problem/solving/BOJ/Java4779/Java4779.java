package org.problem.solving.BOJ.Java4779;

import java.util.Scanner;

public class Java4779 {
    static StringBuilder sb;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N;
        while ((N = sc.nextLine()) != null){
            int n = Integer.parseInt(N);
            sb = new StringBuilder();
            int len = (int) Math.pow(3, n);
            sb.append("-".repeat(Math.max(0, len)));
            recersive(0,len);
            System.out.println(sb);
        }
    }
    private static void recersive(int sNum, int sbLength) {
        if (sbLength==1)return;
        int temp = sbLength / 3;
        for (int i = sNum+temp; i < sNum+(temp*2); i++) {
            sb.setCharAt(i,' ');
        }
        recersive(sNum,temp);
        recersive(sNum+(temp*2),temp);
    }
}
