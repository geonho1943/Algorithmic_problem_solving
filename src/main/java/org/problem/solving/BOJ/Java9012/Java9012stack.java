package org.problem.solving.BOJ.Java9012;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Java9012stack {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            String str = br.readLine();
            Stack<Integer> stack = new Stack<>();
            boolean VPS = true;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j)=='(') stack.push(1);
                else if (str.charAt(j) ==')') {
                    if (!stack.empty())
                    stack.pop();
                    else {
                     VPS =false;
                     break;
                    }
                }
            }
            if (!stack.empty())VPS=false;
            if (VPS) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
