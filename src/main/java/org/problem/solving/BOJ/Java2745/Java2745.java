package org.problem.solving.BOJ.Java2745;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Java2745 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        br.close();
        String N = st.nextToken();
        int sum = 0;
        int B = Integer.parseInt(st.nextToken());
        for (int i = 0; i <N.length() ; i++) {
            char temp = N.charAt(i);
            if (temp <= 57 && temp >= 48){
                sum += (int) ((temp-48) * Math.pow(B, N.length()-i-1));
            } else if (temp >= 65 && temp <= 90) {
                sum += (int) ((temp-55) * Math.pow(B, N.length()-i-1));
            }
        }
        System.out.println(sum);
    }
}

