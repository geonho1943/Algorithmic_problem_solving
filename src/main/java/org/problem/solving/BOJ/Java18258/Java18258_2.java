package org.problem.solving.BOJ.Java18258;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Java18258_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Queue<Integer> queue = new LinkedList<>();
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String[] command = br.readLine().split(" ");
            switch (command[0]) {
                case "push":
                    queue.add(Integer.parseInt(command[1]));
                    break;
                case "pop":
                    if (queue.isEmpty()) sb.append("-1\n");
                    else sb.append(queue.poll()).append("\n");
                    break;
                case "size":
                    sb.append(queue.size()).append("\n");
                    break;
                case "empty":
                    sb.append(queue.isEmpty() ? "1\n" : "0\n");
                    break;
                case "front":
                    if (queue.isEmpty()) sb.append("-1\n");
                    else sb.append(queue.peek()).append("\n");
                    break;
                case "back":
                    if (queue.isEmpty()) sb.append("-1\n");
                    else sb.append(((LinkedList<Integer>) queue).getLast()).append("\n");
                    break;
            }
        }
        System.out.print(sb);
    }
}