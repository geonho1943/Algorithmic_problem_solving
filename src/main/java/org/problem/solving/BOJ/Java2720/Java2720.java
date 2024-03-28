package org.problem.solving.BOJ.Java2720;

import java.util.Scanner;

public class Java2720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < tc; i++) {
            double change = Integer.parseInt(sc.nextLine());
            //쿼터(Quarter, $0.25)의 개수, 다임(Dime, $0.10)의 개수, 니켈(Nickel, $0.05)의 개수, 페니(Penny, $0.01)
            int quarter = 0;
            int dime = 0;
            int nickel = 0;
            int penny = 0;
            while (25 <= change){
                change -=25;
                quarter++;
            }
            while (10 <= change){
                change -=10;
                dime++;
            }
            while (5 <= change){
                change -=5;
                nickel++;
            }
            while (1 <= change){
                change -=1;
                penny++;
            }
            System.out.println(quarter+" "+dime+" "+nickel+" "+penny);
        }
    }
}