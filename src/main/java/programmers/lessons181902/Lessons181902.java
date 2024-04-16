package programmers.lessons181902;

import java.util.Arrays;

public class Lessons181902 {
    public static void main(String[] args) {
        String my_string = "Programmers";
        System.out.println(Arrays.toString(solution(my_string)));
    }
    public static int[] solution(String my_string) {
        int[] answer = new int[52];
        for (int i = 0; i < my_string.length(); i++) {
            int temp = (int)my_string.charAt(i);
            if (65<= temp && temp <=90){
                answer[temp-65]++;
            } else if (97 <= temp && temp <= 122) {
                answer[temp-71]++;
            }
        }
        return answer;
    }
}
