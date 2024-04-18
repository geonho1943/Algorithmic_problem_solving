package programmers.lessons181895;

import java.util.Arrays;

public class Lessons181895 {
    static int idx = 0;
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[][] intervals = {{1,3},{0,4}};
        System.out.println(Arrays.toString(solution(arr, intervals)));
    }
    public static int[] solution(int[] arr, int[][] intervals) {
        int a1 = intervals[0][0];
        int a2 = intervals[0][1];
        int b1 = intervals[1][0];
        int b2 = intervals[1][1];
        int arrLength = (a2-a1)+1+(b2-b1)+1;
        int[] answer = new int[arrLength];
        addArr(arr, answer, a1, a2);
        addArr(arr, answer, b1, b2);
        return answer;
    }
    public static void addArr(int[] arr,int[] answer, int s_idx, int e_idx){
        for (int i = s_idx; i <= e_idx; i++) {
            answer[idx] = arr[i];
            idx++;
        }
    }
}
