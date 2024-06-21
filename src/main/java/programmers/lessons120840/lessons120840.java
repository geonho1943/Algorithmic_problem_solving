package programmers.lessons120840;

public class lessons120840 {
    public static void main(String[] args) {
        int balls = 30;
        int share = 30;
        System.out.println(solution(balls, share));
    }
    static public int solution(int balls, int share) {
        return faNum(balls)/(faNum(balls-share)*faNum(share));
    }

    static public int faNum(int num){
        int ans = 1;
        for (int i = 1; i <= num; i++) {
            ans *= i;
        }
        return ans;
    }
}
