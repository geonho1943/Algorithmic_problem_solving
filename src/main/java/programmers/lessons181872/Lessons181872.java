package programmers.lessons181872;

public class Lessons181872 {
    public static void main(String[] args) {
        String myString = "AAAAaaaa";
        String pat = "a";
        System.out.println(solution(myString, pat));
    }
    public static String solution(String myString, String pat) {
        String answer = "";
        for (int i = myString.length(); i >= 0; i--) {
            String temp = myString.substring(0,i);
            if (temp.endsWith(pat)){
                answer = temp;
                break;
            }
        }
        return answer;
    }
}
