package programmers.lessons181907;

public class Lessons181907 {
    public static void main(String[] args) {
        String my_string = "ProgrammerS123";
        int n = 11;
        System.out.println(solution(my_string, n));
    }
    public static String solution(String my_string, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(my_string.charAt(i));
        }
        String answer = String.valueOf(sb);
        return answer;
    }
}
