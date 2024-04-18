package programmers.lessons181886;

import java.util.Arrays;

public class Lessons181886 {
    public static void main(String[] args) {
        String[] names = {"nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx"};
        System.out.println(Arrays.toString(solution(names)));

    }
    public static String[] solution(String[] names) {
        int arrL = names.length/5;
        if (names.length%5 !=0) arrL+=1;
        String[] answer = new String[arrL];
        for (int i = 0; i < arrL; i++) {
            answer[i] = names[i*5];
        }
        return answer;
    }

}
