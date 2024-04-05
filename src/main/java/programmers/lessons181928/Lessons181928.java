package programmers.lessons181928;

public class Lessons181928 {
    public static void main(String[] args) {
        int[] numList = {3, 4, 5, 2, 1};
        System.out.println(solution(numList));
    }
    public static int solution(int[] num_list) {
        int answer = 0;
        String holsu = "";
        String jjacsu = "";
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i]%2==0){
                holsu+=num_list[i];
            }else {
                jjacsu+=num_list[i];
            }
        }
        answer = Integer.parseInt(holsu);
        answer = answer+Integer.parseInt(jjacsu);
        return answer;
    }
}
