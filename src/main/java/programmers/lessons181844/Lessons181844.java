package programmers.lessons181844;

import java.util.ArrayList;
import java.util.Arrays;

public class Lessons181844 {
    public static void main(String[] args) {
        int[] arr = {293, 1000, 395, 678, 94};
        int[] delete_list = {94, 777, 104, 1000, 1, 12};
        System.out.println(Arrays.toString(solution(arr, delete_list)));
    }
    public static int[] solution(int[] arr, int[] delete_list) {
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            boolean check = true;
            for (int j = 0; j < delete_list.length; j++) {
                if (arr[i]==delete_list[j]) check = false;
            }
            if (check)ans.add(arr[i]);
        }
        int[] answer = new int[ans.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = ans.get(i);
        }
        return answer;
    }
}
