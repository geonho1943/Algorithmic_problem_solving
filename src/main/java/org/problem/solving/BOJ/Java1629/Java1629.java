package org.problem.solving.BOJ.Java1629;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Java1629 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        System.out.println(mod1629(A,B,C));
    }

    private static long mod1629(int a, int b, int c) {
        if (b == 1) return a%c;
        long temp = mod1629(a, b/2, c);
        if (b%2 ==1){
            return ((temp * temp) % c * (a%c)) % c;
        }
        return (temp*temp)%c;
    }

    private static long mod1629_2(int a, int b, int c) {
        if (b == 0) return 1; //AI가 정리한 코드
        if (b == 1) return a % c;
        long temp = mod1629(a, b / 2, c);
        temp = (temp * temp) % c;
        if (b % 2 == 1) {
            temp = (temp * (a % c)) % c;
        }
        return temp;
    }
}