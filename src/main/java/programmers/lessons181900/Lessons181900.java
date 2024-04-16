package programmers.lessons181900;

import java.util.Arrays;

public class Lessons181900 {
    public static void main(String[] args) {
        String my_string = "apporoograpemmemprs";
        int[] indices = {1, 16, 6, 15, 0, 10, 11, 3};
        System.out.println(solution(my_string,indices));
    }
    public static String solution(String my_string, int[] indices) {
        String answer = "";
        StringBuilder sb = new StringBuilder(my_string);
        Arrays.sort(indices);
        sb.deleteCharAt(indices[0]);
        for (int i = 1; i < indices.length; i++) {
            sb.deleteCharAt(indices[i]-i);
        }
        answer = String.valueOf(sb);
        return answer;
    }

}
