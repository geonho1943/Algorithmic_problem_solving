package programmers.lessons181873;

public class Lessons181873 {
    public static void main(String[] args) {
        String my_string = "programmers";
        String alp = "p";
        System.out.println(solution(my_string,alp));
    }
    public static String solution(String my_string, String alp) {
        char chaAlp = alp.charAt(0);
        StringBuilder sb = new StringBuilder(my_string);
        for (int i = 0; i < my_string.length(); i++) {
            char temp = my_string.charAt(i);
            if (temp == chaAlp){
                temp = Character.toUpperCase(temp);
            sb.setCharAt(i,temp);
            }
        }
        return String.valueOf(sb);
    }
}
