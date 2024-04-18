package programmers.lessons181897;

import java.util.Arrays;

public class Lessons181897 {
    public static void main(String[] args) {
        int n = 4;
        int[] slicer = {1,5,2};
        int[] num_list = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(solution(n, slicer, num_list)));
    }
    public static int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer;
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];
        switch (n){
            case 1:
                answer = new int[b+1];
                for (int i = 0; i < answer.length; i++) {
                    answer[i] = num_list[i];
                }
                break;
            case 2:
                answer = new int[num_list.length-a];
                for (int i = 0; i < answer.length; i++) {
                    answer[i] = num_list[a+i];
                }
                break;
            case 3:
                answer = new int[(b-a)+1];
                for (int i = 0; i < answer.length; i++) {
                    answer[i] = num_list[a+i];
                }
                break;
            case 4:
                int lengNum = ((b-a)/c)+1;
                answer = new int[lengNum];
                for (int i = 0; i < answer.length; i++) {
                    answer[i] = num_list[a+(c*i)];
                }
                break;
            default: answer = new int[1];
        }
        return answer;
    }
}
