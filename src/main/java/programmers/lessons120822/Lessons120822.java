package programmers.lessons120822;

public class Lessons120822 {
    public static void main(String[] args) {
        String my_string = "jaron";
        System.out.println(solution(my_string));
    }
    public static String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        for (int i = my_string.length()-1; i >= 0; i--) {
            answer.append(my_string.charAt(i));
        }
        return answer.toString();
    }
}
