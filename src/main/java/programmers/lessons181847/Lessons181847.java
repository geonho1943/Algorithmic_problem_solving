package programmers.lessons181847;

public class Lessons181847 {
    public static void main(String[] args) {
        String n_str = "0010";
        System.out.println(solution(n_str));
    }
    public static String solution(String n_str) {

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n_str.length(); i++) {
            if (n_str.charAt(i)!='0') {
                for (int j = i; j < n_str.length(); j++) {
                    sb.append(n_str.charAt(j));
                }
                break;
            }
        }
        String answer = String.valueOf(sb);
        return answer;
    }
}
