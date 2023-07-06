package org.problem.solving.BOJ.Java1541;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Java1541 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(),"-");

        int subTokenNum = st.countTokens();
        String[] subArr = new String[subTokenNum];
        int[] addArr = new int[subTokenNum];
        for (int i = 0; i < subTokenNum; i++) {
            subArr[i] = st.nextToken();
            StringTokenizer addst = new StringTokenizer(subArr[i],"+");
            int addTokenNum = addst.countTokens();
            for (int j = 0; j < addTokenNum; j++) {
                addArr[i] += Integer.parseInt(addst.nextToken());
            }
        }
        int ans = addArr[0];
        for (int i = 1; i < subTokenNum; i++) {
            ans = ans - addArr[i];
        }
        System.out.println(ans);
    }
}
