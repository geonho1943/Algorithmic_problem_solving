package programmers.lessons181901;

import java.util.Arrays;

public class Lessons181901 {
    public static void main(String[] args) {
        int n = 10;
        int k = 3;
        System.out.println(Arrays.toString(solution(n, k)));
    }
    public static int[] solution(int n, int k) {
        int[] answer = new int[n/k];
        int index = 0;
        for (int i = 1; i <=n ; i++) {
            if (i%k==0){
                answer[index]= i;
                index++;
            }
        }
        return answer;
    }
}
