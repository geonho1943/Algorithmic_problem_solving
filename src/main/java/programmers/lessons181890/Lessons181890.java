package programmers.lessons181890;

import java.util.Arrays;
import java.util.Objects;

public class Lessons181890 {
    public static void main(String[] args) {
        String[] str_list = {"u", "u", "r", "l"};
        System.out.println(Arrays.toString(solution(str_list)));
    }
    public static String[] solution(String[] str_list) {
        String[] answer = {};
        for (int i = 0; i < str_list.length; i++) {
            if (str_list[i].equals("l")){
                String[] arr = new String[i];
                for (int j = 0; j < arr.length; j++) {
                    arr[j] = str_list[j];
                }
                return arr;
            } else if (str_list[i].equals("r")) {
                String[] arr = new String[str_list.length-i-1];
                for (int j = 0; j < arr.length; j++) {
                    arr[j] = str_list[i+j+1];
                }
                return arr;
            }
        }
        return answer;
    }
}
