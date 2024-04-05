package programmers.lessons181927;

import java.util.Arrays;

public class Lessons181927 {
    public static void main(String[] args) {
        int[] num_list = {2, 1, 6};
        System.out.println(Arrays.toString(solution(num_list)));
    }

    public static int[] solution(int[] num_list) {
        int[] newArr = Arrays.copyOf(num_list, num_list.length + 1);
        int ans;
        if (num_list[num_list.length - 1] > num_list[num_list.length - 2]) {
            ans = num_list[num_list.length - 1] - num_list[num_list.length - 2];
        } else {
            ans = num_list[num_list.length - 1] * 2;
        }
        newArr[num_list.length] = ans;
        return newArr;
    }
}