package org.problem.solving.BOJ.Java1260;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Java1260 {
    static StringBuilder sb = new StringBuilder();
    public int N;
    public void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken())+1;
        int M = Integer.parseInt(st.nextToken());
        int start = Integer.parseInt(st.nextToken());
        int [][] map = new int[N][N];
        int [][] vis = new int[N][N];

        for (int i = 0; i < M; i++) {//맵 입력 받기
            StringTokenizer str = new StringTokenizer(br.readLine());
            int fr = Integer.parseInt(str.nextToken());
            int to = Integer.parseInt(str.nextToken());
            map[fr][to] = 1;//양 방향
            map[to][fr] = 1;
        }
        DFS(map,vis,start);//dfs 메서드
        sb.append("\n");
        vis = new int[N][N];
        Deque<Integer> que = new ArrayDeque<>();
        que.add(start);
        BFS(map,vis,que);
        System.out.println(sb);
    }
    public void DFS(int[][] map, int[][] vis, int fr) {
        sb.append(fr+" ");
        for (int i = 0; i < N; ++i) {
            vis[i][fr] =1;//방문 했다고 저장
        }
        for (int to = 0; to < N; ++to) {
            if (map[fr][to] == 1 && vis[fr][to]== 0 ){ //간선은 있는대 간적없는지 확인
                DFS(map,vis,to);//재귀
            }
        }

    }
    public void BFS(int[][] map, int[][] vis, Deque<Integer> que) {
        while (que.size()>0){
            Integer fr = que.pop();
            sb.append(fr+" ");
            for (int i = 0; i < N; ++i) {
                vis[i][fr] =1;
                for (int to = 0; to < N; ++to) {
                    if (map[fr][to] == 1 && vis[fr][to]== 0 ){
                        if (!que.contains(to))que.add(to);
                    }
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        Java1260 main = new Java1260();
        main.solve();

    }
}
