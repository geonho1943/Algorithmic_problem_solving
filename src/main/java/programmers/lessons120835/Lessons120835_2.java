package programmers.lessons120835;

import java.util.Arrays;

public class Lessons120835_2 {
    public static void main(String[] args) {
        int[] emergency = {30, 10, 23, 6, 100};
        System.out.println(Arrays.toString(solution(emergency)));
    }
    public static int[] solution(int[] emergency) {
        int[] copyEmergency = new int[emergency.length];
        System.arraycopy(emergency, 0, copyEmergency, 0, emergency.length);
        int[] answer = new int[emergency.length];
        Arrays.sort(copyEmergency);
        int num = 1;
        for (int i = copyEmergency.length-1; i >=0 ; i--) {
            for (int j = 0; j < emergency.length; j++) {
                if (copyEmergency[i] == emergency[j]){
                    answer[j]=num;
                    num++;
                    break;
                }
            }
        }
        return answer;
    }
}
