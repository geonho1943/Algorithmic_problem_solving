package programmers.lessons181888;

import java.util.Arrays;

public class Lessons181888 {
    public static void main(String[] args) {
        int[] num_list = {4, 2, 6, 1, 7, 6};
        int n = 4;
        System.out.println(Arrays.toString(solution(num_list, n)));
    }
    public static int[] solution(int[] num_list, int n) {
        int ansLength = num_list.length/n;
        if (num_list.length%n !=0) ansLength+=1;
        int[] answer = new int[ansLength];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = num_list[i*n];
        }
        return answer;
    }
}
