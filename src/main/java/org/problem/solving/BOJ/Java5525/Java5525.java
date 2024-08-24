package org.problem.solving.BOJ.Java5525;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Java5525 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()); // N의 값
        int m = Integer.parseInt(br.readLine()); // S 문자열의 길이
        String s = br.readLine(); // 주어진 문자열 S

        int count = 0; // 패턴의 개수
        int i = 0;
        while (i < m-2){
            if (s.charAt(i)=='I' && s.charAt(i+1) == 'O' && s.charAt(i+2) == 'I'){
                int temp = 1;
                i = i + 2;
                while (i + 2 < m && s.charAt(i+1)=='O' && s.charAt(i+2)=='I'){
                    temp++;
                    i+=2;
                }
                if (temp >= n) {
                    count += (temp - n + 1);
                }
            }
            i++;
        }
        System.out.println(count);
    }
}