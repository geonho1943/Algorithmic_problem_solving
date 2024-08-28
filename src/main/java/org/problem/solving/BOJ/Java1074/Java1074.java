package org.problem.solving.BOJ.Java1074;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Java1074 {
    static int ans;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int length = (int) Math.pow(2,N);
        getAns(length,r,c);
        System.out.println(ans);
    }

    private static void getAns(int length, int r, int c) {
        int halfLength = length/2;
        if (length == 1) return;
        else if (r < halfLength && c < halfLength) {
            getAns(halfLength, r, c);
        }else if (r < halfLength && c >= halfLength) {
            ans+= (int) Math.pow(halfLength,2);
            getAns(halfLength, r, c-halfLength);
        }else if (r >= halfLength && c < halfLength) {
            ans+= (int) ((Math.pow(halfLength,2))*2);
            getAns(halfLength, r-halfLength, c);
        }else{
            ans+= (int) ((Math.pow(halfLength,2))*3);
            getAns(halfLength, r-halfLength, c-halfLength);
        }
    }
}