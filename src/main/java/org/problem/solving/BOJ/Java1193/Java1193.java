package org.problem.solving.BOJ.Java1193;

import java.util.Scanner;

public class Java1193 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int per_sum = 0;
        int line = 1;
        while (x > per_sum+line){
            per_sum += line;
            line++;
        }
        if (line%2 ==1){
            System.out.print((line - (x - per_sum - 1)) + "/" + (x - per_sum));

        }else {
            System.out.print((x - per_sum) + "/" + (line - (x - per_sum - 1)));
        }
    }
}