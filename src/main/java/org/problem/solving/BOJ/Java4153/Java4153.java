package org.problem.solving.BOJ.Java4153;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Java4153 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int a,b,c;
        while (true){
            st = new StringTokenizer(br.readLine()," ");
            a= Integer.parseInt(st.nextToken());
            b= Integer.parseInt(st.nextToken());
            c= Integer.parseInt(st.nextToken());
            if (a+b+c ==0) break;
            if (a*a + b*b == c*c || c*c + a*a ==b*b || c*c + b*b == a*a)
                //대각선이 a,b,c 일때 각각 계산해야함
                //Math.pow(n,2) 제곱하는 메서드를 사용할수도 있음
                sb.append("right\n");
            else sb.append("wrong\n");
        }
        System.out.println(sb);
    }
}