package programmers.lessons181936;

public class Lessons181936 {
    public static void main(String[] args) {
        System.out.println();
    }

    public static int solution(int number, int n, int m) {
        int answer = 0;
        if (number%n + number%m ==0) return 1;
        else return 0;
    }
}
