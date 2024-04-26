package programmers.lessons181842;

public class Lessons181842 {
    public static void main(String[] args) {
        String str1="asd";
        String str2 = "aabcc";
        System.out.println();
    }
    public static int solution(String str1, String str2) {
        if (str2.contains(str1))return 1;
        else return 0;
    }
}
