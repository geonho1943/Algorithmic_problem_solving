package org.problem.solving.BOJ.Java10811;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Java10811 {
    static int[] basketArr;
    static int fNum;
    static int sNum;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        basketArr = new int[N+1];
        for (int i = 1; i <= N; i++) {
            basketArr[i] = i;
        }

        for (int i = 0; i < M; i++) {
            StringTokenizer re = new StringTokenizer(br.readLine());
            int fNum = Integer.parseInt(re.nextToken());
            int sNum = Integer.parseInt(re.nextToken());
            basketSwapper(fNum,sNum);
        }

        for (int i = 1; i <= N; i++) {
            System.out.print(basketArr[i]+" ");
        }

    }

    private static void basketSwapper(int fNum, int sNum) {
        while(fNum < sNum){
            int temp = basketArr[fNum];
            basketArr[fNum] = basketArr[sNum];
            basketArr[sNum] = temp;
            fNum++;
            sNum--;
        }
    }

}
