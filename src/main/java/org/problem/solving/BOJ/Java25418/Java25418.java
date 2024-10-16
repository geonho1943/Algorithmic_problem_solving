package org.problem.solving.BOJ.Java25418;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Java25418 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        Queue<int[]> queue = new LinkedList<>();
        boolean[] visited = new boolean[K + 1];
        queue.offer(new int[] {A, 0});
        visited[A] = true;
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int num = current[0];
            int count = current[1];
            if (num == K) System.out.println(count);
            // +1 연산
            count++;
            int plus = num + 1;
            if (plus <= K && !visited[plus]) {
                visited[plus] = true;
                queue.offer(new int[] {plus, count});
            }
            // *2 연산
            int multi = num * 2;
            if (multi <= K && !visited[multi]) {
                visited[multi] = true;
                queue.offer(new int[] {multi, count});
            }
        }
    }
}