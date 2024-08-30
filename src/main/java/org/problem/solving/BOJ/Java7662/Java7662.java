package org.problem.solving.BOJ.Java7662;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.HashMap;

public class Java7662 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); // 테스트 케이스 수

        for (int t = 0; t < T; t++) {
            int k = Integer.parseInt(br.readLine()); // 각 테스트 케이스에 대한 연산 수
            PriorityQueue<Integer> minHeap = new PriorityQueue<>(); // 최소 힙
            PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder()); // 최대 힙
            HashMap<Integer, Integer> map = new HashMap<>(); // 숫자의 카운트를 기록

            for (int i = 0; i < k; i++) {
                String[] input = br.readLine().split(" ");
                char command = input[0].charAt(0);
                int num = Integer.parseInt(input[1]);

                if (command == 'I') {
                    // 삽입 명령
                    minHeap.add(num);
                    maxHeap.add(num);
                    map.put(num, map.getOrDefault(num, 0) + 1);
                } else if (command == 'D') {
                    // 삭제 명령
                    if (map.isEmpty()) continue;

                    if (num == 1) {
                        // 최댓값 삭제
                        removeTop(maxHeap, map);
                    } else if (num == -1) {
                        // 최솟값 삭제
                        removeTop(minHeap, map);
                    }
                }
            }

            // 모든 연산이 끝난 후 결과 출력
            if (map.isEmpty()) {
                System.out.println("EMPTY");
            } else {
                int maxValue = removeTop(maxHeap, map);
                int minValue = removeTop(minHeap, map);
                System.out.println(maxValue + " " + minValue);
            }
        }
    }

    private static int removeTop(PriorityQueue<Integer> heap, HashMap<Integer, Integer> map) {
        while (!heap.isEmpty()) {
            int num = heap.peek();
            int count = map.getOrDefault(num, 0);

            if (count == 0) {
                heap.poll(); // 힙에서 제거하지만 맵에는 없는 경우
            } else {
                // 유효한 값 발견
                map.put(num, count - 1);
                if (count - 1 == 0) {
                    map.remove(num);
                }
                return num;
            }
        }
        return 0; // 비어있는 경우 호출 시 사용
    }
}