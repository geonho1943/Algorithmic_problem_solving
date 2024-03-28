package programmers.lessons181942;

public class Lessons181942 {
    public static void main(String[] args) {
        String str1 = "aaa";
        String str2 = "bbb";
        System.out.println(solution(str1,str2));
    }
    public static String solution(String str1, String str2) {
        String answer = "";
        for (int i = 0; i < str1.length(); i++) {
            answer += str1.charAt(i);
            answer += str2.charAt(i);
        }
        return answer;
    }
}
