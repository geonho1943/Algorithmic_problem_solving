package org.problem.solving.BOJ.Java19532;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Java19532 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputNum = sc.nextLine();
        StringTokenizer st = new StringTokenizer(inputNum, " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        int f = Integer.parseInt(st.nextToken());
        int numx=0;
        int numy=0;
        for (int x = -999; x <= 999; x++) {
            for (int y = -999; y <= 999; y++) {

                if ((a*x)+(b*y)==c && (d*x)+(e*y)==f) {
                numx=x;
                numy=y;
                break;
                }
            }
        }
        System.out.println(numx+" "+numy);
    }

}
