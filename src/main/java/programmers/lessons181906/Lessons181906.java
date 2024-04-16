package programmers.lessons181906;

public class Lessons181906 {
    public static void main(String[] args) {
        String my_string = "banana";
        String is_prefix = "bananan";
        System.out.println(solution(my_string, is_prefix));
    }
    public static int solution(String my_string, String is_prefix) {
        if (my_string.length() < is_prefix.length()) return 0;
        for (int i = 0; i < is_prefix.length(); i++) {
            if (my_string.charAt(i) != is_prefix.charAt(i)) return 0;
        }
        return 1;
    }
}
