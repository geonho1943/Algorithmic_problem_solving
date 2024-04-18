package programmers.lessons181884;

public class Lessons181884 {
    public static void main(String[] args) {
        int[] numbers = {34, 5, 71, 29, 100, 34};
        int n = 123;
        System.out.println(solution(numbers, n));
    }
    public static int solution(int[] numbers, int n) {
        int answer = 0;
        for (int i = 0; i < numbers.length; i++) {
            answer+=numbers[i];
            if (answer > n)return answer;
        }
        return answer;
    }

}
