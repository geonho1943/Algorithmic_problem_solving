package org.problem.solving.BOJ.Java13549;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Java13549_3 {
    static int min = Integer.MAX_VALUE;
    static int n, k;
    static boolean[] visited;
    static int max = 100000;

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        n = scan.nextInt();
        k = scan.nextInt();

        visited = new boolean[max + 1];
        bfs();
        System.out.println(min);
    }

    public static void bfs() {
        Queue<int[]> q = new LinkedList<>();
        int[] temp = {n,0};
        q.offer(temp);
        while (!q.isEmpty()) {
            int[] current = q.poll();
            int x = current[0];
            int time = current[1];
            visited[x] = true;
            if (x == k) {
                min = Math.min(min, time);
            }
            if (x * 2 <= max && !visited[x * 2]) {
                temp = new int[]{x * 2, time};
                q.offer(temp);
            }
            if (x + 1 <= max && !visited[x + 1]) {
                q.offer(new int[] {x + 1, time + 1});
            }
            if (x - 1 >= 0 && !visited[x - 1]) {
                q.offer(new int[] {x - 1, time + 1});
            }
        }
    }
}
