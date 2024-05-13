package programmers.lessons120835;

import java.util.Arrays;

public class Lessons120835 {
    public static void main(String[] args) {
        int[] emergency = {3, 76, 24};
        System.out.println(Arrays.toString(solution(emergency)));
    }
    public static int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int temp = Integer.MIN_VALUE;
        int idx= -1;
        boolean[] check = new boolean[answer.length];
        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < answer.length; j++) {
                if (temp < emergency[j] && !check[j]){
                    idx = j;
                    temp = emergency[j];
                }
            }
            answer[idx] = i+1;
            check[idx]=true;
        }
        return answer;
    }
}
