package programmers.lessons181887;

public class Lessons181887 {
    public static void main(String[] args) {
        int[] num_list = {4, 2, 6, 1, 7, 6};
        System.out.println(solution(num_list));
    }
    public static int solution(int[] num_list) {
        int single = 0;
        int couple = 0;
        for (int i = 0; i < num_list.length; i++) {
            if (i%2==1) single+=num_list[i];
            else couple+=num_list[i];
        }
        return Math.max(single,couple);
    }
}
