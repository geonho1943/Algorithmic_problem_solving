package programmers.lessons181860;

import java.util.ArrayList;
import java.util.Arrays;

public class Lessons181860 {
    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 1, 3};
        boolean[] flag = {true, false, true, false, false};
        System.out.println(Arrays.toString(solution(arr, flag)));
    }
    public static int[] solution(int[] arr, boolean[] flag) {

        ArrayList<Integer> asd = new ArrayList<>();
        for (int i = 0; i < flag.length; i++) {
            if (flag[i]){
                int repit = arr[i]*2;
                for (int j = 0; j < repit; j++) {
                    asd.add(arr[i]);
                }
            }else {
                for (int j = 0; j < arr[i]; j++) {
                    asd.remove(asd.size()-1);
                }

            }
        }
        int[] answer = new int[asd.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = asd.get(i);
        }
        return answer;
    }
}
