package programmers.lessons181875;

import java.util.Arrays;

public class Lessons181875 {
    public static void main(String[] args) {
        String[] strArr = {"AAA","BBB","CCC","DDD"};
        System.out.println(Arrays.toString(solution(strArr)));
    }
    public static String[] solution(String[] strArr) {
        String[] answer = new String[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            String repet = strArr[i];
            StringBuilder sb = new StringBuilder(repet);
            if (i%2==0){
                //짝수 > 소
                for (int j = 0; j < repet.length(); j++) {
                    char asd = Character.toLowerCase(repet.charAt(j));
                    sb.setCharAt(j, asd);
                }
            }else {
                //홀수 > 대
                for (int j = 0; j < repet.length(); j++) {
                    char asd = Character.toUpperCase(repet.charAt(j));
                    sb.setCharAt(j, asd);
                }
            }
            answer[i] = String.valueOf(sb);
        }
        return answer;
    }
}
