package programmers.lessons181934;

import java.util.Objects;

public class Lessons181934 {
    public static void main(String[] args) {
        System.out.println(solution("<",	"=",20,	50));
    }
    public static int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        if (eq.equals("=")){
            if (ineq.equals(">")){
                if (n>=m)return 1;
                else return 0;
            }else {
                if (n<=m)return 1;
                else return 0;
            }
        }
        if (eq.equals("!")){
            if (ineq.equals(">")){
                if (n>m)return 1;
                else return 0;
            }else {
                if (n<m)return 1;
                else return 0;
            }
        }
        return answer;
    }
}
