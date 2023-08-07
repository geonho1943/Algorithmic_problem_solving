package org.problem.solving.BOJ.Java11773;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Java11773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());
        LinkedList<Integer> stack = new LinkedList<>();
        for (int i = 0; i < K; i++) {
            int temp = Integer.parseInt(br.readLine());
            if (temp != 0){
                stack.addFirst(temp);
            }else {
                stack.poll();
            }
        }
        int sum=0;
        while (!stack.isEmpty()){
            sum+= stack.poll();
        }
        System.out.println(sum);
    }
}
