package programmers.lessons181891;

import java.util.Arrays;

public class Lessons181891 {
    public static void main(String[] args) {
        int[] num_list = {2,1,6};
        int n = 1;
        System.out.println(Arrays.toString(solution(num_list, n)));
    }
    public static int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        int idx = 0;
        for (int i = n; i < num_list.length; i++) {
            answer[idx] = num_list[i];
            idx++;
        }
        for (int i = 0; i < n; i++) {
            answer[idx] = num_list[i];
            idx++;
        }
        return answer;
    }

}
