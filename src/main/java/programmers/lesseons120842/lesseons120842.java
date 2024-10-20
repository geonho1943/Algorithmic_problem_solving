package programmers.lesseons120842;

import java.util.Arrays;
import java.util.LinkedList;

public class lesseons120842 {
    public static void main(String[] args) {
        int[] num_list = {1, 2, 3, 4, 5, 6, 7, 8};
        int n =2;
        System.out.println(Arrays.deepToString(solution(num_list, n)));
    }

    public static int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length/n][n];
        int idx = 0;
        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < n; j++) {
                answer[i][j] = num_list[idx];
                idx++;
            }
        }
        return answer;
    }
}
