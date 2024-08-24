package org.problem.solving.BOJ.Java11279;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Java11279 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(br.readLine());
            if (x == 0) {
                //가장 큰 값 반환,제거
                if (maxHeap.peek()==null){
                    System.out.println(0);
                }else System.out.println(maxHeap.poll());
            }else {
                //힙에 x 추가m
                maxHeap.add(x);
            }
        }
    }
}
