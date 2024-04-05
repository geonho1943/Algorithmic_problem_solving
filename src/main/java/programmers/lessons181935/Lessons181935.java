package programmers.lessons181935;

public class Lessons181935 {
    public static void main(String[] args) {
        System.out.println(solution(10));
    }
    public static int solution(int n) {
        int answer = 0;
        if (n%2!=0){
            int temp=0;
            for (int i = 1; i <=n ; i++) {
                answer +=i;
                i++;
            }
        }else{
            for (int i = 2; i <=n ; i++) {
                answer +=i*i;
                i++;
            }
        }
        return answer;
    }
}
