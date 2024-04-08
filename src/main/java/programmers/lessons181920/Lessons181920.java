package programmers.lessons181920;

import java.util.Arrays;
import java.util.LinkedList;

public class Lessons181920 {
    public static void main(String[] args) {
        int start_num =3;
        int end_num =10;
        System.out.println(Arrays.toString(solution(start_num, end_num)));
    }
    public static int[] solution(int start_num, int end_num) {
        int temp = end_num-start_num;
        int[] answer = new int[temp+1];
        for (int i = 0; i <= temp; i++) {
            answer[i] = i+start_num;
        }
        return answer;
    }
}
