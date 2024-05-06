package programmers.lessons120826;



public class Lessons120826 {
    public static void main(String[] args) {
        String my_string = "BCBdbe";
        String letter = "B";
        System.out.println(solution(my_string, letter));
    }
    public static String solution(String my_string, String letter) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < my_string.length(); i++) {
            String asd = String.valueOf(my_string.charAt(i));
            if (!asd.equals(letter)){
                answer.append(my_string.charAt(i));
            }
        }
        return String.valueOf(answer);
    }
}
