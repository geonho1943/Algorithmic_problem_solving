package org.problem.solving.BOJ.Java15681;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Java15681 {
    static HashMap<Integer, ArrayList<Integer>> tree;
    static int[] nodeCount;
    static boolean[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());
        int Q = Integer.parseInt(st.nextToken());
        tree = new HashMap<>();
        for (int i = 1; i <= N; i++) {
            tree.put(i, new ArrayList<>());
        }
        for (int i = 0; i < N - 1; i++) {
            st = new StringTokenizer(br.readLine());
            int node1 = Integer.parseInt(st.nextToken());
            int node2 = Integer.parseInt(st.nextToken());
            tree.get(node1).add(node2);
            tree.get(node2).add(node1); // 무방향
        }
        nodeCount = new int[N+1];
        visited = new boolean[N+1];
        treeDP(R);
        for (int i = 0; i < Q; i++) {
            int semiRootNode = Integer.parseInt(br.readLine());
            System.out.println(nodeCount[semiRootNode]);
        }
    }

    private static int treeDP(int curNode) {
        visited[curNode] = true;
        int count = 0;
        ArrayList<Integer> childNode = tree.get(curNode);
        for (int i = 0; i < childNode.size(); i++) {
            int nextNode = childNode.get(i);
            if (!visited[nextNode]){
                count += treeDP(nextNode);
            }
        }
//        for (int temp: childNode){
//            if (visited[temp]){
//                count+=treeDP(temp);
//            }
//        }
        nodeCount[curNode] = count + 1;
        return count+1;
    }
}