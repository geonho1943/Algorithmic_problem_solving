package programmers.lessons120824;

import java.util.Arrays;

public class Lessons120824 {
    public static void main(String[] args) {
        int[] num_list = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(solution(num_list)));

    }
    public static int[] solution(int[] num_list) {
//        int[] answer = new int[num_list.length];
        int[] ansDS = new int[2];
        for (int j : num_list) {
            if (j % 2 == 0) ansDS[0]++;
            else ansDS[1]++;
        }
        return ansDS;
    }
}
