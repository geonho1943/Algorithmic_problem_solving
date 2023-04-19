package org.problem.solving.BOJ.Java10828;

import java.util.Scanner;
import java.util.Stack;

public class Java10828 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int N = sc.nextInt();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < N; i++) {
            String com = sc.next();
            switch (com){
                case "push":
                    stack.push(sc.nextInt());//push
                    break;
                case "pop":
                    if (stack.isEmpty())sb.append("-1\n");
                    else sb.append(stack.pop()+"\n");
                    break;
                case "size":
                    sb.append(stack.size()+"\n");
                    break;
                case "empty":
                    if (stack.isEmpty())sb.append("1\n");
                    else sb.append("0\n");
                    break;
                case "top":
                    if (stack.isEmpty()) sb.append("-1\n");
                    else sb.append(stack.peek()+"\n");
                    break;
            }
        }
        System.out.println(sb);
    }
}
