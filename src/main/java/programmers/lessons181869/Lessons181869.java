package programmers.lessons181869;

import java.util.Arrays;

public class Lessons181869 {
    public static void main(String[] args) {
        String my_string = "i love you";
        System.out.println(Arrays.toString(solution(my_string)));
    }
    public static String[] solution(String my_string) {
        String[] answer = my_string.split(" ");
        return answer;
    }
}
