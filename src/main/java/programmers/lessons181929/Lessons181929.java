package programmers.lessons181929;

public class Lessons181929 {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 2, 1};
        System.out.println(solution(arr));
    }

    public static int solution(int[] num_list) {
        int answer = 0;
        int prosum =num_list[0];
        int sum=num_list[0];
        for (int i = 1; i < num_list.length; i++) {
            prosum*=num_list[i];
            sum+=num_list[i];
        }
        if (sum*sum < prosum){
            return 0;
        }else return 1;
    }

}
