package org.problem.solving.BOJ.Java10448;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Java10448Method {
    static int arr[] = new int[45];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        //삼각수를 배열에 저장 한다
        for(int j = 1; j < 45; j++) {
            arr[j] = j * (j + 1) / 2;
        }

        for (int i = 0; i < T; i++) {
            int K = Integer.parseInt(br.readLine());
            //K가 3개의 삼각수의 합으로 표현할수 있다면 1, 없다면 0 을 출력한다
            System.out.println(checkNum(K));
        }

    }

    private static int checkNum(int K){
        //K가 3개의 삼각수 합과 같을때 1을 출력한다
        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                for (int k = 1; k < arr.length; k++) {
                    if (K == arr[i]+arr[j]+arr[k]){
                        return 1;
                    }
                }
            }
        }
        return 0;
    }
}
