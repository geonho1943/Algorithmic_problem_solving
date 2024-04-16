package programmers.lessons181901;

import java.util.Arrays;

public class Lessons181901_2 {
    public static void main(String[] args) {
        int n = 10;
        int k = 3;
        System.out.println(Arrays.toString(solution(n, k)));
    }
    public static int[] solution(int n, int k) {
        //i 번 반복하는 과정을 i/k 번으로 단축
        int repeat = n/k;
        int[] answer = new int[repeat];
        for (int i = 0; i < repeat; i++) {
            answer[i]=(i+1)*k;
        }
        return answer;
    }
}
