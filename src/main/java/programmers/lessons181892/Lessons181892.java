package programmers.lessons181892;

import java.util.Arrays;

public class Lessons181892 {
    public static void main(String[] args) {
        int[] num_list = {2,1,6};
        int n = 3;
        System.out.println(Arrays.toString(solution(num_list, n)));
    }
    public static int[] solution(int[] num_list, int n) {
        int length = num_list.length+1-n;
        int[] answer = new int[length];
        for (int i = 0; i < length; i++) {
            answer[i] = num_list[n-1+i];
        }
        return answer;
    }
}
