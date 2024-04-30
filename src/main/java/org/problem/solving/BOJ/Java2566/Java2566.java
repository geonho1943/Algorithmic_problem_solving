package org.problem.solving.BOJ.Java2566;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Java2566 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int maxInt = 0;
        int[] xy = new int[2];
        int temp;
        for (int i = 0; i < 9; i++) {
            st = new StringTokenizer(br.readLine()," ");
            for (int j = 0; j < 9; j++) {
                temp = Integer.parseInt(st.nextToken());
                if (maxInt <= temp){
                    maxInt = temp;
                    xy[0]=i+1;
                    xy[1]=j+1;
                }
            }
        }
        System.out.println(maxInt);
        System.out.println(xy[0]+" "+xy[1]);
    }
}
