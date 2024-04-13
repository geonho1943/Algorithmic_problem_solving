package programmers.lessons181903;

public class Lessons181903 {
    public static void main(String[] args) {
        int q = 1;
        int r = 0;
        String code = "qjnwezgrpirldywt";
        System.out.println(solution(q,r,code));
    }
    public static String solution(int q, int r, String code) {
        String answer = "";
        for (int i = 0; i < code.length(); i++) {
            if (i%q ==r){
                answer+=code.charAt(i);
            }
        }
        return answer;
    }
}
