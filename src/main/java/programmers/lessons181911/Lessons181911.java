package programmers.lessons181911;

public class Lessons181911 {
    public static void main(String[] args) {
        String[] my_strings = {"progressive", "hamburger", "hammer", "ahocorasick"};
        int[][] parts = {{0,4},{1,2},{3,5},{7,7}};
        System.out.println(solution(my_strings,parts));
    }
    public static String solution(String[] my_strings, int[][] parts) {
        String answer = "";
        for (int i = 0; i < parts.length; i++) {

            int start = parts[i][0];
            int end = parts[i][1];
            for (int j = start; j <= end; j++) {
                answer+=my_strings[i].charAt(j);
            }
        }
        return answer;
    }
}
