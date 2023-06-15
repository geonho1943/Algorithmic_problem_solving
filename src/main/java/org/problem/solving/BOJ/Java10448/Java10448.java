package org.problem.solving.BOJ.Java10448;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Java10448 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        //삼각수를 배열에 저장 한다
        int arr[] = new int[45];
        for(int j = 1; j < 45; j++) {
            arr[j] = j * (j + 1) / 2;
        }

        for (int i = 0; i < T; i++) {
            int K = Integer.parseInt(br.readLine());
            //K가 3개의 삼각수의 합으로 표현할수 있다면 1, 없다면 0 을 출력한다

            boolean ans=false;
            //K가 3개의 삼각수 합과 같을때 1을 출력한다
            for (int j = 1; j < arr.length; j++) {
                for (int k = 1; k < arr.length; k++) {
                    for (int l = 1; l < arr.length; l++) {
                        int temp = arr[j] + arr[k] + arr[l];
                        if (K == temp) {
                            ans = true;
                            break;
                        }
                    }
                    if (ans) {
                        break;
                    }
                }
                if (ans) {
                    break;
                }
            }
            //아니면 0을 출력 한다
            if (ans) System.out.println(1);
            else System.out.println(0);
        }

    }
}