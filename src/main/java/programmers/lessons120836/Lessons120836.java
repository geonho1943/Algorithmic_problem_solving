package programmers.lessons120836;

public class Lessons120836 {
    public static void main(String[] args) {
        int n = 20;
        System.out.println(solution(n));
    }
    public static int solution(int n) {
        int count = 0;
        for(int i=1; i<=n; i++) {
            if(n % i == 0) count++;
        }
        return count;
    }
}
