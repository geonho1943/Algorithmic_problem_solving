package org.problem.solving.BOJ.Java1978;

import java.util.Scanner;

public class Java1978 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans =0;
        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            if (m==1)continue;
            if (m==2)ans++;
            if (m==3)ans++;
            int count=0;
            for (int j = 2; j <= Math.sqrt(m); j++) {
                if (m%j==0){//약수가 있음
                    count=0;
                    break;
                }
                count++;
            }
            if (count >=1) ans++;
        }
        System.out.println(ans);
    }
}
