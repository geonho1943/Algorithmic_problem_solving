package programmers.lessons181861;

import java.util.ArrayList;
import java.util.Arrays;

public class Lessons181861 {
    public static void main(String[] args) {
        int[] arr = {5,1,4};
        System.out.println(Arrays.toString(solution(arr)));
    }
    public static int[] solution(int[] arr) {

        ArrayList<Integer> asd = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            for (int j = 0; j < temp; j++) {
                asd.add(temp);
            }
        }
        int[] answer = new int[asd.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = asd.get(i);
        }
        return answer;
    }
}
