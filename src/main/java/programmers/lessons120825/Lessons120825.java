package programmers.lessons120825;

public class Lessons120825 {
    public static void main(String[] args) {
        String my_string = "hello";
        int n = 3;
        System.out.println(solution(my_string, n));
    }
    public static String solution(String my_string, int n) {
        StringBuilder answer = new StringBuilder();
        for (int j = 0; j < my_string.length(); j++) {
            for (int i = 0; i < n; i++) {
                answer.append(my_string.charAt(j));
            }
        }
        return answer.toString();
    }
}
