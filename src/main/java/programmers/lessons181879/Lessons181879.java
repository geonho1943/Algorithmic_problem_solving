package programmers.lessons181879;

public class Lessons181879 {
    public static void main(String[] args) {
        int[] num_list = {3, 4, 5, 2, 5, 4, 6, 7, 3, 7, 2, 2, 1};
        System.out.println(solution(num_list));
    }
    public static int solution(int[] num_list) {
        if (num_list.length >= 11){
            int sum = 0;
            for (int i = 0; i < num_list.length; i++) {
                sum+=num_list[i];
            }
            return sum;
        }else {
            int sum = num_list[0];
            for (int i = 1; i < num_list.length; i++) {
                sum*=num_list[i];
            }
            return sum;
        }
    }

}
