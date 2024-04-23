package programmers.lessons181854;

import java.util.Arrays;

public class Lessons181854 {
    public static void main(String[] args) {
        int[] arr = {49, 12, 100, 276, 33};
        int n = 27;
        System.out.println(Arrays.toString(solution(arr, n)));
    }
    public static int[] solution(int[] arr, int n) {
        if (arr.length%2==1){
            for (int i = 0; i < arr.length; i++) {
                arr[i]+=n;
                i++;
            }
        }else {
            for (int i = 1; i < arr.length; i++) {
                arr[i]+=n;
                i++;
            }
        }
        return arr;
    }
}
