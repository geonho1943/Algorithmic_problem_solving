package org.problem.solving.BOJ.Java12789;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Java12789 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int turn = 1;

        for (int i = 0; i < n; i++) {
            int temp = Integer.parseInt(st.nextToken());
            if (temp == turn) {
                turn++;
            } else {
                while (!stack.isEmpty() && stack.peek() == turn) {
                    stack.pop();
                    turn++;
                }

                if (!stack.isEmpty() && stack.peek() < temp) {
                    System.out.println("Sad");
                    return;
                }
                stack.push(temp);
            }
        }
        while (!stack.isEmpty() && stack.peek() == turn) {
            stack.pop();
            turn++;
        }
        if (stack.isEmpty()) System.out.println("Nice");
        else System.out.println("Sad");
    }
}
