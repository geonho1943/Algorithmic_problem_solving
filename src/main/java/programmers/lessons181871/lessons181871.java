package programmers.lessons181871;

public class lessons181871 {
    public static void main(String[] args) {
        String myString = "banana";
        String pat = "ana";
        System.out.println(solution(myString,pat));
    }
    public static int solution(String myString, String pat) {
        int answer = 0;
        for (int i = 0; i <= myString.length()-pat.length(); i++) {
            String temp = myString.substring(i,i+pat.length());
            if (temp.equals(pat)){
                answer++;
            }
        }
        return answer;
    }
}
