package org.problem.solving.BOJ.Java11286;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;
import java.util.PriorityQueue;

public class Java11286 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int i = 0; i < N; i++) {
            int x = Integer.parseInt(br.readLine());

            if (x !=0){
                queue.add(x);
            }
            else {
                if (queue.peek()==null){
                    sb.append(0).append("\n");
                }else {
                    sb.append(queue.poll()).append("\n");
                }

            }

        }
        System.out.println(sb);

    }
}
