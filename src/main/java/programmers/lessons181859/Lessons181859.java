package programmers.lessons181859;

import java.util.ArrayList;
import java.util.Arrays;

public class Lessons181859 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 1, 0};
        System.out.println(Arrays.toString(solution(arr)));
    }
    public static int[] solution(int[] arr) {
        ArrayList<Integer> stk = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (stk.isEmpty()){
                stk.add(arr[i]);
            } else if (stk.get(stk.size() - 1)==arr[i]) {
                stk.remove(stk.size() - 1);
            } else if (stk.get(stk.size() - 1) != arr[i]) {
                stk.add(arr[i]);
            }
        }
        if (stk.isEmpty()){
            return new int[]{-1};
        }else {
            int[] answer = new int[stk.size()];
            for (int i = 0; i < stk.size(); i++) {
                answer[i] = stk.get(i);
            }
            return answer;
        }
    }
}
