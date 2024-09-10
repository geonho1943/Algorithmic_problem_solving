package org.problem.solving.BOJ.Java13549;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Java13549 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int ans = Integer.MAX_VALUE;
        Queue<Integer> queue = new LinkedList<>();
        int[] time = new int[100001];
        boolean[] visited = new boolean[100001];
        queue.add(N);
        while (!queue.isEmpty()){
            int temp = queue.poll();
            if (temp == K) ans = Math.min(ans, time[temp]);
            if (temp*2 <= 100000 && !visited[temp*2]){
                queue.offer(temp*2);
                visited[temp*2] = true;
                time[temp*2] = time[temp];
            }
            if (temp+1 <= 100000 &&!visited[temp + 1]){
                queue.offer(temp+1);
                visited[temp+1] = true;
                time[temp+1] = time[temp]+1;
            }
            if (temp-1 >= 0 &&!visited[temp - 1]){
                queue.offer(temp-1);
                visited[temp-1] = true;
                time[temp-1] = time[temp]+1;
            }
        }
        System.out.println(ans);
    }
}