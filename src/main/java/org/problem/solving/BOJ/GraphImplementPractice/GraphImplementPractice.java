package org.problem.solving.BOJ.GraphImplementPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GraphImplementPractice {
    public static void main(String[] args) {
        // 그래프의 정점 1, 2

        // O(1)로 빠르게 조회가 가능한 HashMap을 사용해 보자

        //1:1관계 정점의 연결정보만 저장이 가능한 간단하고 빠른 그래프
        HashMap<Integer, Integer> simpleGraph = new HashMap<>();
        simpleGraph.put(1,2);

        // (추가) 그래프의 정점 1, 2 의 가중치 5

        //1:1관계 정점의 가중치를 저장 할 수 있는 간단하고 빠른 그래프
        HashMap<Integer, int[]> weightGraph = new HashMap<>();
        weightGraph.put(1, new int[]{2,5});

        // (추가) 그래프의 정점 1, 3 의 가중치 6

        // 1:n관계 정점의 가중치까지 저장할 수 있는 그래프
        HashMap<Integer, List<int[]>> manyWeightGraph = new HashMap<>();
        manyWeightGraph.put(1, new ArrayList<>()); // 리스트 객체를 생성 해줘야 함
        manyWeightGraph.get(1).add(new int[]{2,5});
        manyWeightGraph.get(1).add(new int[]{3,10});

        // 1:n관계 정점의 가중치까지 저장할 수 있는 그래프의 양(무)방향 그래프
        HashMap<Integer, List<int[]>> undirectedWeightGraph = new HashMap<>();
        undirectedWeightGraph.put(1, new ArrayList<>());
        undirectedWeightGraph.put(2, new ArrayList<>());
        undirectedWeightGraph.put(3, new ArrayList<>());

        undirectedWeightGraph.get(1).add(new int[]{2,5});
        undirectedWeightGraph.get(1).add(new int[]{3,6});
        undirectedWeightGraph.get(2).add(new int[]{1,5});
        undirectedWeightGraph.get(3).add(new int[]{1,6});
    }
}