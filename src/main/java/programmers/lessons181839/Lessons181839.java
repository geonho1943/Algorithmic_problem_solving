package programmers.lessons181839;

public class Lessons181839 {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        System.out.println(solution(a,b));
    }
    public static int solution(int a, int b) {
        int answer = 0;
        if (a%2!=0 && b%2!=0) return a*a + b*b;
        else if (a % 2 == 0 && b % 2 == 0) {
            if (a>b)return a-b;
            else return b-a;
        } else return 2*(a+b);
    }
}
