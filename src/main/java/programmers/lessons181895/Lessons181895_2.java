package programmers.lessons181895;

import java.util.Arrays;

public class Lessons181895_2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[][] intervals = {{1,3},{0,4}};
        System.out.println(Arrays.toString(solution(arr, intervals)));
    }
    public static int[] solution(int[] arr, int[][] intervals) {
        int aLength = intervals[0][1] - intervals[0][0];
        int bLength = intervals[1][1] - intervals[1][0];
        int arrLength = aLength + bLength+2;
        int[] answer = new int[arrLength];
        int idx=0;
        for (int i = intervals[0][0]; i <= intervals[0][1]; i++) {
            answer[idx] = arr[i];
            idx++;
        }
        for (int i = intervals[1][0]; i <= intervals[1][1]; i++) {
            answer[idx] = arr[i];
            idx++;
        }
        return answer;
    }
}
