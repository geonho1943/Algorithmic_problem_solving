package org.problem.solving.BOJ.Java24444;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Java24444 {

    static Map<Integer, ArrayList<Integer>> map;
    static boolean[] visit;
    static int[] ansArr;
    static int count = 1;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());
        map = new HashMap<>();
        // 간선의 상태: 무방향, 1:N, 무가중치
        for (int i = 0; i < N; i++) {
            map.put(i, new ArrayList<>());
        }
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken())-1;
            int v = Integer.parseInt(st.nextToken())-1;
            map.get(u).add(v);
            map.get(v).add(u);
        }
        ansArr = new int[N];
        visit = new boolean[N];
        BFS(R-1);
        for (int i = 0; i < N; i++) {
            System.out.println(ansArr[i]);
        }
    }

    private static void BFS(int R) {
//        PriorityQueue que = new PriorityQueue();
        Queue<Integer> que = new LinkedList<>();
        que.add(R);
        while (!que.isEmpty()){
            int u = que.poll();
            if (!visit[u]){
                visit[u] = true;
                ansArr[u] = count++;
                ArrayList<Integer> v = map.get(u);
                Collections.sort(v);
                v.sort(Comparator.naturalOrder());
                que.addAll(v);
//                for (int i = 0; i < v.size(); i++) {
//                    que.add(v.indexOf(i));
//                }
            }
        }
    }
}