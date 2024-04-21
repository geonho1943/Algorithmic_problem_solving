package programmers.lessons181863;

public class Lessons181863 {
    public static void main(String[] args) {
        String rny_string = "masterpiece";
        System.out.println(solution(rny_string));
    }
    public static String solution(String rny_string) {
        String answer = rny_string.replaceAll("m", "rn");
        return answer;
    }

}
