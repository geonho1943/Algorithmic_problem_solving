package programmers.lessons181939;

public class Lessons181939 {
    public static void main(String[] args) {
        System.out.println(solution(9,91));
    }
    public static int solution(int a, int b) {
        int ab = Integer.parseInt(String.valueOf(a)+String.valueOf(b));
        int ba = Integer.parseInt(String.valueOf(b)+String.valueOf(a));
        return Math.max(ab,ba);
    }
}