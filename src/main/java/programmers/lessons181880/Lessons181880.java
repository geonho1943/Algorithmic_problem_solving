package programmers.lessons181880;

public class Lessons181880 {
    public static void main(String[] args) {
        int[] num_list = {12, 4, 15, 1, 14};
        System.out.println(solution(num_list));
    }
    public static int solution(int[] num_list) {
        int answer = 0;
        for (int i = 0; i < num_list.length; i++) {
            int num =num_list[i];
            int temp =0;
            while (num!=1){
                if (num%2==0){
                    num/=2;
                    temp++;
                }else {
                    num = (num-1)/2;
                    temp++;
                }
            }
            answer+=temp;
        }
        return answer;
    }

}
