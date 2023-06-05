package org.problem.solving.BOJ.Java2164;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Java2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Queue<Integer> card = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            card.offer(i+1);
        }
        while (card.size() > 1){
            card.poll();
            card.offer(card.poll());
        }
        System.out.println(card.poll());

    }
}

