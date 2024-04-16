package programmers.lessons181904;

public class Lessons181904 {
    public static void main(String[] args) {
        String my_string = "ihrhbakrfpndopljhygc";
        int m = 4;
        int c = 2;
        System.out.println(solution(my_string, m, c));
    }
    public static String solution(String my_string, int m, int c) {
        String answer = "";
        StringBuilder temp = new StringBuilder();
        int i =c-1;
        while (i < my_string.length()){
            temp.append(my_string.charAt(i));
            i+=m;
        }
        answer = String.valueOf(temp);
        return answer;
    }
}