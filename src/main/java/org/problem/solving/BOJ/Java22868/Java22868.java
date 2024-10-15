package org.problem.solving.BOJ.Java22868;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Java22868 {
    static HashMap<Integer, ArrayList<Integer>> graph;
    static boolean[] check;
    static ArrayList<ArrayList<Integer>> course;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        graph = new HashMap<>();
        for (int i = 1; i <= N; i++) {
            graph.put(i, new ArrayList<>());
        }
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph.get(a).add(b);
            graph.get(b).add(a); // 양방향
        }

        course = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            course.add(new ArrayList<>());  // 각 노드에 대한 경로 저장 공간 초기화
        }

        check = new boolean[N + 1];
        st = new StringTokenizer(br.readLine());
        int S = Integer.parseInt(st.nextToken());
        int E = Integer.parseInt(st.nextToken());

        // 첫 번째 BFS로 출발지에서 목적지까지의 경로를 찾고 경로 기록
        int ans1 = BFS(S, E);

        // 두 번째 BFS로 목적지에서 출발지로 돌아오는 경로를 찾고, 첫 번째 경로에서 사용된 노드를 피해서 탐색
        Arrays.fill(check, false);  // 방문 배열 초기화
        int ans2 = backBFS(E, S, course.get(E));

        // 두 경로의 합 출력
        System.out.println(ans1 + ans2);
    }

    static int BFS(int startNode, int endNode) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(startNode);
        check[startNode] = true;  // 시작 노드를 방문 처리
        course.get(startNode).add(startNode);  // 시작 노드 경로 초기화

        while (!queue.isEmpty()) {
            int nowNode = queue.poll();
            ArrayList<Integer> nowCourse = course.get(nowNode);  // 현재 노드까지의 경로
            ArrayList<Integer> nextNodes = graph.get(nowNode);  // 현재 노드에서 갈 수 있는 다음 노드 목록

            for (int nextNode : nextNodes) {
                if (!check[nextNode]) {  // 아직 방문하지 않은 노드에 대해서만
                    check[nextNode] = true;  // 방문 처리
                    queue.add(nextNode);

                    // 현재 노드까지의 경로를 복사해서 다음 노드 경로로 사용
                    ArrayList<Integer> newCourse = new ArrayList<>(nowCourse);
                    newCourse.add(nextNode);
                    course.set(nextNode, newCourse);  // 다음 노드에 갱신된 경로 저장
                    if (nextNode == endNode) {
                        break;
                    }
                }
            }
        }

        // 목표 노드에 도달한 경로의 길이를 반환
        return course.get(endNode).size() - 1;  // 경로 길이는 노드 수 - 1
    }
    static int backBFS(int startNode, int endNode, ArrayList<Integer> checkedCource) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(startNode);
        check[startNode] = true;

        // 목적지 노드를 blockedCourse에서 제거
        checkedCource.remove(Integer.valueOf(endNode));

        while (!queue.isEmpty()) {
            int nowNode = queue.poll();
            ArrayList<Integer> nextNodes = graph.get(nowNode);

            for (int nextNode : nextNodes) {
                // 경로에 포함되지 않은 노드만 탐색
                if (!check[nextNode] && !checkedCource.contains(nextNode)) {
                    check[nextNode] = true;
                    queue.add(nextNode);
                    if (nextNode == endNode) {
                        return course.get(nowNode).size();  // 경로 길이 반환
                    }
                }
            }
        }

        return -1; // 문제가 있는 경우
    }

}