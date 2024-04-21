package programmers.lessons120815;

public class Lessons120815 {
    public static void main(String[] args) {
        int n =10;
        System.out.println(solution(n));
    }
    public static int solution(int n) {
        int answer = 0;
        do {answer++;}
        while ((answer*6)%n!=0);
        return answer;
    }
}
