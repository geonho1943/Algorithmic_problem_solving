package programmers.lessons181840;

public class Lessons181840 {
    public static void main(String[] args) {
        int[] num_list = {15, 98, 23, 2, 15};
        int n = 20;
        System.out.println(solution(num_list,n));
    }
    public static int solution(int[] num_list, int n) {
        int answer = 0;
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i]==n) {
                answer=1;
                break;
            }
        }
        return answer;
    }
}
