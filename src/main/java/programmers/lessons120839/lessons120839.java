package programmers.lessons120839;

public class lessons120839 {
    public static void main(String[] args) {
        String rsp = "205";
        System.out.println(solution(rsp));
    }
    static public String solution(String rsp) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < rsp.length(); i++) {
            if (rsp.charAt(i)=='2') answer.append("0");
            else if (rsp.charAt(i)=='0') answer.append("5");
            else answer.append("2");
        }
        return answer.toString();
    }
}
