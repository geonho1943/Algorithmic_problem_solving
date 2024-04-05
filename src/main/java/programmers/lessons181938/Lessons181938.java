package programmers.lessons181938;

public class Lessons181938 {
    public static void main(String[] args) {
        System.out.println(solution(2,91));
    }
    public static int solution(int a, int b) {
        int ab = Integer.parseInt(String.valueOf(a)+String.valueOf(b));
        int ab2 = 2*a*b;
        return Math.max(ab,ab2);
    }
}