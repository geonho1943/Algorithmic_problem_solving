package org.problem.solving.BOJ.Java9461;

import java.util.LinkedList;
import java.util.Scanner;

public class Java9461 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = Integer.parseInt(sc.nextLine());
        LinkedList<Integer> wave = new LinkedList<>();
        wave.add(1);wave.add(1);
        wave.add(1);wave.add(2);
        wave.add(2);wave.add(3);
        wave.add(4);wave.add(5);
        wave.add(7);wave.add(9);
        for (int i  = 0; i < testCase; i++) {
            int p = Integer.parseInt(sc.nextLine())-1;
            if (p < 10){
                System.out.println("정답은: "+wave.get(p));
            } else if (p >= 10) {
                for (int j = 10; j <= p; j++) {
                    //list[i] = list[i-1]+List[i-5]
                    int temp = wave.get(j-1) + wave.get(j-5);
                    wave.add(j,temp);
                }
                System.out.println("정답은: "+wave.get(p));

            }

            System.out.println("==============");
        }

    }
}
