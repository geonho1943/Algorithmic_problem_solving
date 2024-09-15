package programmers;
public class Solution {
public static void main(String[] args) {
    String my_string = "cccCCC";
    System.out.println(solution(my_string));
    }
    public static String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < my_string.length(); i++) {
            char temp = my_string.charAt(i);
            if (Character.isUpperCase(temp)){
                answer.append(Character.toLowerCase(temp));
            }else {
                answer.append(Character.toUpperCase(temp));
            }
        }
        return answer.toString();
    }
}
