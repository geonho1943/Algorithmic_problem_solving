package org.problem.solving.BOJ.Java28278;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Java28278 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            switch (st.nextToken()){
                case "1" :
                    stack.add(Integer.valueOf(st.nextToken()));
                    break;
                case "2" :
                    if (stack.isEmpty()) sb.append(-1+"\n");
                    else sb.append(stack.pop()+"\n");
                    break;
                case "3" :
                    sb.append(stack.size()+"\n");
                    break;
                case "4" :
                    if (stack.isEmpty()) sb.append(1+"\n");
                    else sb.append(0+"\n");
                    break;
                case "5" :
                    if (stack.isEmpty()) sb.append(-1+"\n");
                    else sb.append(stack.peek()+"\n");
                    break;
            }
        }
        System.out.println(sb);
    }
}
