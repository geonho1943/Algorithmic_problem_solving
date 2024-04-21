package programmers.lessons181867;

import java.util.Arrays;

public class Lessons181867 {
    public static void main(String[] args) {
        String myString = "oxooxoxxox";
        System.out.println(Arrays.toString(solution(myString)));
    }
    public static int[] solution(String myString) {
        String[] splitArr = myString.split("x", myString.length());
        int[] answer = new int[splitArr.length];

        for (int i = 0; i < splitArr.length; i++) {
            answer[i] = splitArr[i].length();
        }
        return answer;
    }
}
