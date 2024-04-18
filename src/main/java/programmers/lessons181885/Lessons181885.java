package programmers.lessons181885;

import java.util.Arrays;

public class Lessons181885 {
    public static void main(String[] args) {
        String[] todo_list = {"problemsolving", "practiceguitar", "swim", "studygraph"};
        boolean[] finished = {true, false, true, false};
        System.out.println(Arrays.toString(solution(todo_list, finished)));
    }
    public static String[] solution(String[] todo_list, boolean[] finished) {
        int idx = 0;
        for (int i = 0; i < finished.length; i++)if (!finished[i]) idx++;
        String[] answer = new String[idx];
        int num = 0;
        for (int i = 0; i < todo_list.length; i++) {
            if (!finished[i]){
                answer[num]=todo_list[i];
                num++;
            }
        }
        return answer;
    }
}
