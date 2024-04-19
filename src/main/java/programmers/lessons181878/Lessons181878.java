package programmers.lessons181878;

public class Lessons181878 {
    public static void main(String[] args) {
        String myString = "aaAA";
        String pat = "aaaaa";
        System.out.println(solution(myString, pat));
    }
    public static int solution(String myString, String pat) {
        String myStringTemp = myString.toLowerCase();
        String patTemp = pat.toLowerCase();
        if (myStringTemp.contains(patTemp)){
            return 1;
        }else {
            return 0;
        }
    }

}
