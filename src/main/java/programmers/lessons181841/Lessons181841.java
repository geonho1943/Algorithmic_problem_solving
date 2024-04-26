package programmers.lessons181841;

import java.util.ArrayList;

public class Lessons181841 {
    public static void main(String[] args) {
        String[] str_list = {"abc", "def", "ghi"};
        String ex = "ef";
        System.out.println(solution(str_list,ex));
    }
    public static String solution(String[] str_list, String ex) {
        ArrayList<String> ans = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str_list.length; i++) {
            if (!str_list[i].contains(ex))sb.append(str_list[i]);
        }
        String answer = String.valueOf(sb);
        return answer;
    }
}
