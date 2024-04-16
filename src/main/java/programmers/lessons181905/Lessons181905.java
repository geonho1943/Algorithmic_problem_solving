package programmers.lessons181905;

public class Lessons181905 {
    public static void main(String[] args) {
        String my_string = "Progra21Sremm3";
        int s = 6;
        int e = 12;
        System.out.println(solution(my_string, s, e));
    }
    public static String solution(String my_string, int s, int e) {
        StringBuilder sb = new StringBuilder(my_string);
        int repeat = (e-s)/2;
        for (int i = 0; i <= repeat; i++) {
            char temp = sb.charAt(s+i);
            sb.setCharAt(s+i, sb.charAt(e-i));
            sb.setCharAt(e-i, temp);
        }
        String answer = String.valueOf(sb);
        return answer;
    }
}
