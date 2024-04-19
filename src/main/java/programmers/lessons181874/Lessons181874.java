package programmers.lessons181874;

public class Lessons181874 {
    public static void main(String[] args) {
        String myString = "abstract algebra";
        String test = "aSD";
        System.out.println(solution(test));
    }
    public static String solution(String myString) {
        StringBuilder sb = new StringBuilder(myString);
        for (int i = 0; i < myString.length(); i++) {
            char temp =myString.charAt(i);
            if (temp=='a'){
                sb.setCharAt(i,'A');
            } else if (Character.isUpperCase(temp)&& temp !='A') {
                char charcha = Character.toLowerCase(temp);
                sb.setCharAt(i,charcha);
            }
        }
        return String.valueOf(sb);
    }

}
