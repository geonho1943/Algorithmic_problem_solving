package org.problem.solving.BOJ.Java11005;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Java11005 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        Stack<Integer> stack = new Stack<>();
        int decima = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int tempAns;
        while (decima > 0) {
            tempAns = decima % N;
            stack.push(tempAns);
            decima /= N;
        }
        while (!stack.isEmpty()){
            int ans = stack.pop();
            if (ans > 9){
                System.out.print((char)(ans+55));
            }else System.out.print(ans);
        }
    }
}
