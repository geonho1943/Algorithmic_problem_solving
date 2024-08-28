package org.problem.solving.BOJ.Java11286;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Java11286_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                //절댓값 비교로 변경
                if(Math.abs(o1) > Math.abs(o2)) {
                    return Math.abs(o1) - Math.abs(o2);
                }else if(Math.abs(o1) == Math.abs(o2)) {
                    return o1 - o2;
                }else {
                    return -1;
                }
            }
        });

        for (int i = 0; i < N; i++) {
            int x = Integer.parseInt(br.readLine());
            if (x != 0) queue.add(x);
            else {
                if (queue.peek() == null){
                    sb.append(0).append("\n");
                }else sb.append(queue.poll()).append("\n");
            }
        }
        System.out.println(sb);
    }
}
