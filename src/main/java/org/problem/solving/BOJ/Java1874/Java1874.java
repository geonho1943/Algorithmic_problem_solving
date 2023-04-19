package org.problem.solving.BOJ.Java1874;

import java.util.Scanner;
import java.util.Stack;

public class Java1874 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        int start =0;
        String ans="";
        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            if (value > start){
                for (int j = start+1; j <= value ; j++) {
                    st.push(j);
                    sb.append("+\n");
                }
                start = value;
            } else if (st.peek() != value) {
                System.out.println("NO");
                return;
            }
            st.pop();
            sb.append("-\n");
        }
        System.out.println(sb);
    }
}
