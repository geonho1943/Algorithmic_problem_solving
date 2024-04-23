package programmers.lessons181858;

import java.util.ArrayList;
import java.util.Arrays;

public class Lessons181858 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 1, 1};
        int k = 4;
        System.out.println(Arrays.toString(solution(arr, k)));
    }
    public static int[] solution(int[] arr, int k) {
        int forK = 1;
        ArrayList<Integer> asd = new ArrayList<>();
        asd.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (forK ==k) break;
            int obj = arr[i];
            boolean check = true;
            for (int j = 0; j < asd.size(); j++) {
                if (obj == asd.get(j)) check = false;
            }
            if (check){
                asd.add(obj);
                forK++;
            }
        }//asd 는 완성 되었음
        int[] answer = new int[k];
        for (int i = 0; i < k; i++) {
            if (asd.size() > i){
                answer[i]= asd.get(i);
            }else answer[i]= -1;
        }
        return answer;
    }
}
