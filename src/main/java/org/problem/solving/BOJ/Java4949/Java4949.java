package org.problem.solving.BOJ.Java4949;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Java4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String str = br.readLine();

            if (str.equals(".")) {
                break;
            }

            boolean isValid = true;
            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < str.length(); i++) {
                Character cha = str.charAt(i);
                if (cha == '(' || cha == '[') {
                    stack.push(cha);
                } else if (cha == ')' || cha == ']') {
                    if (stack.empty()) {
                        isValid = false;
                        break;
                    }
                    if (cha == ')' && stack.peek() == '(') {
                        stack.pop();
                    } else if (cha == ']' && stack.peek() == '[') {
                        stack.pop();
                    } else {
                        isValid = false;
                        break;
                    }
                }
            }

            if (!stack.empty()) {
                isValid = false;
            }

            String result = isValid ? "yes" : "no";
            sb.append(result).append("\n");
        }

        System.out.println(sb);
    }
}
