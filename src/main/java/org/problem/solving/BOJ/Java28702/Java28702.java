package org.problem.solving.BOJ.Java28702;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class Java28702 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int ans=0;
        for (int i = 0; i < 3; i++) {
            String temp = br.readLine();
            if (!Objects.equals(temp, "Fizz") && !Objects.equals(temp, "Buzz") &&
            !Objects.equals(temp, "FizzBuzz") ){
                int sumTemp = Integer.parseInt(temp);
                ans = sumTemp+3-i;
                break;
            }
        }
        StringBuilder sb = new StringBuilder();
        if (ans%3 == 0){
            if (ans%5 == 0){
                sb.append("FizzBuzz");
            }else {
                sb.append("Fizz");
            }
        } else if (ans%5 == 0) {
            sb.append("Buzz");
        }else sb.append(ans);

        System.out.println(sb);

    }
}
