package programmers.lessons181894;

import java.util.Arrays;

public class Lessons181894 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 4, 5, 2, 9};
        System.out.println(Arrays.toString(solution(arr)));
    }
    public static int[] solution(int[] arr) {
        int sNum = arr.length;
        int eNum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==2){
                sNum=i;
                break;
            }
        }
        for (int i = arr.length-1; i > 0; i--) {
            if (arr[i]==2){
                eNum=i;
                break;
            }
        }
        if (sNum== arr.length && eNum ==0)return new int[]{-1};
        int[] answer = new int[eNum+1-sNum];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = arr[sNum+i];
        }
        return answer;
    }

}
