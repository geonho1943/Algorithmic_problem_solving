package org.problem.solving.BOJ.Java15725;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Java15725 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        if (!input.contains("x")) {
            System.out.println(0);
        } else {
            StringTokenizer st = new StringTokenizer(input, "x");
            String temp = st.nextToken();
            if (temp.equals("")) {
                System.out.println(1);
            } else if (temp.equals("-")) {
                System.out.println("-1");
            } else {
                System.out.println(temp);
            }
        }
    }
}