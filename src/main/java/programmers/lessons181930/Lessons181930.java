package programmers.lessons181930;
//소요시간 22분

public class Lessons181930 {
    public static void main(String[] args) {
        int a= 4;
        int b= 4;
        int c= 4;
        System.out.println(solution(a,b,c));

    }
    public static int solution(int a, int b, int c) {
        int answer = 0;
        int temp = 0;
        if (a == b) temp++;
        if (b == c) temp++;
        if (c == a) temp++;
        if (temp == 0){
            answer = a+b+c;
        } else if (temp == 1) {
            answer = (a+b+c)*(a*a+b*b+c*c);
        } else if (temp == 3) {
            answer = (a+b+c)*(a*a+b*b+c*c)*(a*a*a+b*b*b+c*c*c);
        }
        return answer;
    }
}