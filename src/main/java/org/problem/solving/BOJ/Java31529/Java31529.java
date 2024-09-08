package org.problem.solving.BOJ.Java31529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Java31529 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
//        if (y >= x && x*2 >= y){
//            int temp = x*2 - y;
//            System.out.println(2024*(temp/4));
//        }else System.out.println(-1);
        if (2*x <y  || y < x) System.out.println(-1);
        else System.out.println(506*(x*2-y));
    }
}
