package programmers.lessons181924;

import java.util.Arrays;

public class Lessons181924 {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        int[][] queries = {{1, 4}};
//        [5, 4, 3, 2, 1], [[1, 4]]
        //51324
        System.out.println(Arrays.toString(solution(arr, queries)));
    }
    public static int[] solution(int[] arr, int[][] queries) {
        for (int i = 0; i < queries.length; i++) {
            int asd = arr[queries[i][0]];
            arr[queries[i][0]] = arr[queries[i][1]];
            arr[queries[i][1]] = asd;
        }
        return arr;
    }
}
