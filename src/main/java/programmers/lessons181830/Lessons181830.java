package programmers.lessons181830;

import java.util.Arrays;

public class Lessons181830 {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {1, 2, 3},{1, 2, 3}, {1, 2, 3}};
        System.out.println(Arrays.deepToString(solution(arr)));
    }
    public static int[][] solution(int[][] arr) {
        int h = arr.length;
        int w = arr[0].length;
        if (h>w){
            int[][] ans = new int[h][h];
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    ans[i][j] = arr[i][j];
                }
            }
            return ans;
        }else if (w>h){
            int[][] ans = new int[w][w];
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    ans[i][j] = arr[i][j];
                }
            }
            return ans;
        }else{
            return arr;
        }
    }
}
