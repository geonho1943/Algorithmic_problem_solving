package programmers.lessons181940;

public class Lessons181940 {
    public static void main(String[] args) {
        String asd = "string";
        System.out.println(solution(asd,3));

    }

    public static String solution(String my_string, int k) {
        String answer = "";
        for (int i = 0; i < k; i++) {
                answer +=my_string;
        }
        return answer;
    }
}
