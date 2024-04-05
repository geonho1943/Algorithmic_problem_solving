package programmers.lessons181941;

public class Lessons181941 {
    public static void main(String[] args) {
        String[] asd = {"a","b","c"};
        System.out.println(solution(asd));
    }
    public static String solution(String[] arr) {
        String answer = "";
        for (int i = 0; i < arr.length; i++) {
            answer+=arr[i];
        }
        return answer;
    }

}
