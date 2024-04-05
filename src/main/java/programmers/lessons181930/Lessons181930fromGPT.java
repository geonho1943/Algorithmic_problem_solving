package programmers.lessons181930;

public class Lessons181930fromGPT {
    public static void main(String[] args) {
        int a = 4;
        int b = 4;
        int c = 4;
        System.out.println(solution(a, b, c));
    }

    public static int solution(int a, int b, int c) {
        if (a == b && b == c) {
            return (a + b + c) * (a * a + b * b + c * c) * (a * a * a + b * b * b + c * c * c);
        } else if (a == b || b == c || c == a) {
            return (a + b + c) * (a * a + b * b + c * c);
        } else {
            return a + b + c;
        }
    }
}