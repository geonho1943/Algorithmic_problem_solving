package programmers.lessons181918;

import java.util.Arrays;
import java.util.Stack;

public class Lessons181918 {
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 5, 3};
        System.out.println(Arrays.toString(solution(arr)));
    }

    public static int[] solution(int[] arr) {
        Stack<Integer> stk = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (stk.isEmpty()){
                stk.add(arr[i]);
            } else if (stk.peek() < arr[i]) {
                stk.add(arr[i]);
            } else {
                while (!stk.isEmpty() && stk.peek() >= arr[i]) {
                    stk.pop();
                }
                stk.add(arr[i]);
            }
        }
        int[] ans = new int[stk.size()];
        int siz = stk.size();
        for (int i = 0; i < siz; i++) {
            ans[(siz-1) -i] = stk.pop();
        }
        return ans;
    }
}
