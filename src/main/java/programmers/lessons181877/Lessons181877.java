package programmers.lessons181877;

public class Lessons181877 {
    public static void main(String[] args) {
        String myString = "aBcDeFg";
        System.out.println(solution(myString));
    }
    public static String solution(String myString) {
        StringBuilder answer = new StringBuilder(myString);
        for (int i = 0; i < myString.length(); i++) {
            char temp = Character.toUpperCase(myString.charAt(i));
            answer.setCharAt(i, temp);
        }
        return String.valueOf(answer);
    }
}
