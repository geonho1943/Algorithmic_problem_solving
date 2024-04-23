package programmers.lessons181852;

import java.util.Arrays;

public class Lessons181852 {
    public static void main(String[] args) {
        int[] num_list = {12, 4, 15, 46, 38, 1, 14, 56, 32, 10};
        System.out.println(Arrays.toString(solution(num_list)));
    }
    public static int[] solution(int[] num_list) {

        Arrays.sort(num_list);
        int[] answer = new int[num_list.length-5];
        for (int i = 0; i < num_list.length - 5; i++) {
            answer[i]=num_list[i+5];
        }
        return answer;
    }
}
