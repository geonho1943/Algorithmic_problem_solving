package programmers.lessons181925;

public class Lessons181925 {
    public static void main(String[] args) {
        int[] numLog = {0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1};
        System.out.println(solution(numLog));
    }
    public static String solution(int[] numLog) {
        String answer = "";
        for (int i = 1; i < numLog.length; i++) {
            int asd = numLog[i-1];
            int asd2 = numLog[i];
            if (asd < asd2){
                //더하기를 했을경우
                if (asd2-asd ==10){
                    answer+='d';
                }else {
                    answer+='w';
                }
            }else {
                //빼기
                if (asd-asd2 ==10){
                    answer+='a';
                }else {
                    answer+='s';
                }
            }
        }
        return answer;
    }
}