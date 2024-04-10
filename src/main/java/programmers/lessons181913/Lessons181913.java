package programmers.lessons181913;

public class Lessons181913 {
    public static void main(String[] args) {
        String my_string = "rermgorpsam";
        int[][] queries = {{2,3},{0,7},{5,9},{6,10}};
        System.out.println(solution(my_string,queries));
    }
    public static String solution(String my_string, int[][] queries) {
        StringBuilder sb = new StringBuilder(my_string);
        for (int i = 0; i < queries.length; i++) {
            int start = queries[i][0];
            int end = queries[i][1];
            while (start < end) {
                char temp = sb.charAt(start);
                sb.setCharAt(start, sb.charAt(end));
                sb.setCharAt(end, temp);
                start++;
                end--;
            }
        }
        return String.valueOf(sb);
    }
}
