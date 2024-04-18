package programmers.lessons181889;

import java.util.Arrays;

public class Lessons181889 {
    public static void main(String[] args) {
        int[] num_list = {2,1,6};
        int n = 1;
        System.out.println(Arrays.toString(solution(num_list, n)));
    }
    public static int[] solution(int[] num_list, int n) {
        int[] answer = new int[n];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = num_list[i];
        }
        return answer;
    }
}
