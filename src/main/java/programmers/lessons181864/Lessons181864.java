package programmers.lessons181864;

public class Lessons181864 {
    public static void main(String[] args) {
        String myString = "ABBAA";
        String pat = "AABB";
        System.out.println(solution(myString,pat));
    }
    public static int solution(String myString, String pat) {
        StringBuilder sb = new StringBuilder(myString);
        for (int i = 0; i < myString.length(); i++) {
            if (myString.charAt(i) == 'A'){
                sb.setCharAt(i,'B');
            } else if (myString.charAt(i) == 'B') {
                sb.setCharAt(i,'A');
            }
        }
        String temp = sb.toString();
        if (temp.contains(pat))return 1;
        else return 0;
    }
}
