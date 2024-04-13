package programmers.lessons181910;

public class Lessons181910 {
    public static void main(String[] args) {
        String my_string = "ProgrammerS123";
        int n = 11;
        System.out.println(solution(my_string,n));
    }
    public static String solution(String my_string, int n) {
        StringBuilder answer = new StringBuilder();
        int startNum = my_string.length()-n;
        for (int i = startNum; i < my_string.length(); i++) {
            answer.append(my_string.charAt(i));
        }
        return answer.toString();
    }
}
