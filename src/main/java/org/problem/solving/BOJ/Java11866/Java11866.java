package org.problem.solving.BOJ.Java11866;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Java11866 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        sc.close();
        Queue<Integer> circle = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            circle.offer(i);
        }
        StringBuilder sb = new StringBuilder();
        sb.append('<');
        while(circle.size() > 1) {
            for(int i = 0; i < K - 1; i++) {
                circle.offer(circle.poll());
            }
            sb.append(circle.poll()).append(", ");
        }
        sb.append(circle.poll()).append('>');
        System.out.println(sb);
    }
}
