package org.problem.solving.BOJ.Java15803;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Java15803 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int[][] xy = new int[3][2];
        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());
            xy[i][0]= Integer.parseInt(st.nextToken());
            xy[i][1]= Integer.parseInt(st.nextToken());
        }
        int area = xy[0][0]*xy[1][1]+
                   xy[1][0]*xy[2][1]+
                   xy[2][0]*xy[0][1];
        area -= xy[1][0]*xy[0][1]+
                xy[2][0]*xy[1][1]+
                xy[0][0]*xy[2][1];
        if (area != 0) System.out.println("WINNER WINNER CHICKEN DINNER!");
        else System.out.println("WHERE IS MY CHICKEN?");
    }
}