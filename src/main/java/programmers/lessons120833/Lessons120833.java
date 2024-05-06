package programmers.lessons120833;

import java.util.Arrays;

public class Lessons120833      {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        int num1 = 1;
        int num2 = 3;
        System.out.println(Arrays.toString(solution(numbers, num1, num2)));
    }
    public static int[] solution(int[] numbers, int num1, int num2) {
        int l = num2-num1+1;
        int[] arr = new int[l];
        for (int i = num1; i <= num2; i++) {
            arr[i-num1] = numbers[i];
        }
        return arr;
    }
}