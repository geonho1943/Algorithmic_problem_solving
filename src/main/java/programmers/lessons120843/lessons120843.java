package programmers.lessons120843;

public class lessons120843 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        int k = 5;
        System.out.println(solution(numbers, k));
    }
    public static int solution(int[] numbers, int k) {
        int idx = (k*2)-2;
        idx = idx % numbers.length;
        return numbers[idx];
    }
}
