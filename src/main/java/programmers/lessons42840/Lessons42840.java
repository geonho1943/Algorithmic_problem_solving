package programmers.lessons42840;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lessons42840 {
    public static void main(String[] args) {
        int[] answers = {1,2,3,4,5};
        System.out.println(Arrays.toString(solution(answers)));
    }
    public static int[] solution(int[] answers) {
        int[] _1 = {1,2,3,4,5};
        int c1 = 0;
        int[] _2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int c2 = 0;
        int[] _3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int c3 = 0;
        for (int i = 0; i < answers.length; i++) {
            if (answers[i]==_1[i&_1.length])c1++;
            if (answers[i]==_2[i&_2.length])c2++;
            if (answers[i]==_3[i&_3.length])c3++;
        }

        int max = Math.max(c1, Math.max(c2, c3));
        List<Integer> list = new ArrayList<>();
        if (max == c1) list.add(1);
        if (max == c2) list.add(2);
        if (max == c3) list.add(3);

        // List를 int 배열로 변환
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
