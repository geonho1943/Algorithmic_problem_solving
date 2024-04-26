package programmers.lessons181838;

public class Lessons181838 {
    public static void main(String[] args) {
        int[] date1 = {2021, 12, 28};
        int[] date2 = {2021, 12, 29};
        System.out.println(solution(date1,date2));
    }
    public static int solution(int[] date1, int[] date2) {
        int answer = 0;
        for (int i = 0; i < 3; i++) {
            if(date1[i] != date2[i]){
                return date1[i] < date2[i] ? 1 : 0;
            }
        }
        return 0;
    }
}
