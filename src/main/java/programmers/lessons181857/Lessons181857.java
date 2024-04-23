package programmers.lessons181857;

import java.util.Arrays;

public class Lessons181857 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(solution(arr)));
    }
    public static int[] solution(int[] arr) {
        int[] answer = {};
        int num = arr.length;
        int repit = 1;
        while (repit < arr.length) repit *=2;

        return Arrays.copyOf(arr,repit);
    }
}
