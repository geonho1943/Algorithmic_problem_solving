package programmers.lessons181899;

import java.util.Arrays;

public class Lessons181899 {
    public static void main(String[] args) {
        int start = 10;
        int end_num = 3;
        System.out.println(Arrays.toString(solution(start, end_num)));
    }
    public static int[] solution(int start, int end_num) {
        int repet = start-end_num+1;
        int[] answer = new int[repet];
        for (int i = 0; i < repet; i++) {
            answer[i] = start-i;
        }
        return answer;
    }
}
