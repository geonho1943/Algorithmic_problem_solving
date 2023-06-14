package org.problem.solving.BOJ.Java27866;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Java27866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
//        int i = br.read()-48;
        int i = Integer.parseInt(br.readLine());
        System.out.println(S.charAt(i-1));
    }
}
