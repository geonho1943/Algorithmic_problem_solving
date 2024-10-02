package org.problem.solving.BOJ.Java11725;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Java11725 {
    static int N;
    static List<Integer> ansArr;
    static ArrayList<int[]> input;
    static boolean[] check;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        input = new ArrayList<>();
        for (int i = 0; i < N-1; i++) {
            st = new StringTokenizer(br.readLine());
            int node1 = Integer.parseInt(st.nextToken());
            int node2 = Integer.parseInt(st.nextToken());
            input.add(new int[]{node1, node2});
        }
        ansArr = new ArrayList<>();
        check = new boolean[N];
        dfs(1);
        for (int i = 0; i < ansArr.size(); i++) {
            System.out.println(ansArr.get(i));
        }
    }
    private static void dfs(int startNode) {
        check[startNode] = true;
        for (int i = 0; i < N; i++) {
            int[] nextNode = input.get(i);
            if (nextNode[1] == startNode && check[nextNode[1]]){
                ansArr.add(nextNode[0], startNode);
                dfs(nextNode[0]);
            } else if (nextNode[0] == startNode && check[nextNode[0]]) {
                ansArr.add(nextNode[1], startNode);
                dfs(nextNode[1]);
            }
        }
    }
}