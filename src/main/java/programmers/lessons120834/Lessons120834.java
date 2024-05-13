package programmers.lessons120834;

public class Lessons120834 {
    public static void main(String[] args) {
        int age = 23;
        System.out.println(solution(age));
    }
    public static String solution(int age) {
        String num = String.valueOf(age);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < num.length(); i++) {
            int asd = num.charAt(i)+49;
            sb.append((char)asd);
        }
        return sb.toString();
    }
}
