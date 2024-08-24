package programmers.lessons120849;

public class lessons120849 {
    public static void main(String[] args) {
        String my_string = "nice to meet you";
        //a, e, i, o, u 모음 제거
        System.out.println(solution(my_string));
    }
    public static String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        String aeiou = "aeiou";
        for (int i = 0; i < my_string.length(); i++) {
            boolean tempChar = true;
            char temp = my_string.charAt(i);

            for (int j = 0; j < aeiou.length(); j++) {
                if ( my_string.charAt(i) == aeiou.charAt(j) ){
                    tempChar = false;
                    break;
                }else tempChar = true;
            }
            if (tempChar)sb.append(my_string.charAt(i));

        }
        return String.valueOf(sb);
    }
}
