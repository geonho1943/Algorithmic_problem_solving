package programmers.lessons181914;

import java.util.logging.Logger;

public class Lessons181914 {
    public static void main(String[] args) {
        String num = "123";
        System.out.println(solution(num));
    }
    public static int solution(String number) {
        int answer = 0;
        for (int i = 0; i < number.length(); i++) {
             answer += Integer.parseInt(String.valueOf(number.charAt(i)));
        }
        return answer%9;
    }
}
