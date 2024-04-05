package programmers.lessons181937;

public class Lessons181937 {
    public static void main(String[] args) {
        System.out.println(solution(98,2));
    }

    public static int solution(int num, int n) {
        int answer = 0;
        if(num%n==0) return 1;
        else return 0;
    }
}
