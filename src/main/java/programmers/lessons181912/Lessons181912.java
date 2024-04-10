package programmers.lessons181912;

import java.util.Arrays;
import java.util.LinkedList;

public class Lessons181912 {
    public static void main(String[] args) {
        String[] intStrs = {"0123456789","9876543210","9999999999999"};
        int k = 50000;
        int s = 5;
        int l = 5;
        System.out.println(Arrays.toString(solution(intStrs, k, s, l)));
    }

    public static int[] solution(String[] intStrs, int k, int s, int l) {

        LinkedList<Integer> asd = new LinkedList<>();
        for (int i = 0; i < intStrs.length; i++) {
            int temp = Integer.parseInt(intStrs[i].substring(s,s+l));
            if (temp > k) asd.add(temp);
        }
        int[] answer = new int[asd.size()];
        for (int i = 0; i < asd.size(); i++) {
            answer[i] = asd.get(i);
        }
        return answer;
    }
}
