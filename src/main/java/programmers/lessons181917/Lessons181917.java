package programmers.lessons181917;

public class Lessons181917 {
    public static void main(String[] args) {
        boolean x1 = false;
        boolean x2 = true;
        boolean x3 = true;
        boolean x4 = true;
        System.out.println(solution(x1,x2,x3,x4));
    }
    public static boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = true;
        if((x1 || x2)&&(x3||x4)){
            return true;
        }
        return answer;
    }
}
