package programmers.lessons120844;

import java.util.Arrays;
import java.util.Objects;

public class lessons120844 {
    public static void main(String[] args) {
        int[] number = {4, 455, 6, 4, -1, 45, 6};
        String direction = "right";
        System.out.println(Arrays.toString(solution2(number, direction)));
    }
    public static int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        if (Objects.equals(direction, "left")){
            for (int i = 0; i < answer.length; i++) {
                answer[i] = numbers[(i+1)%answer.length];
            }
        }else {
            for (int i = 0; i < answer.length; i++) {
                answer[i+1%answer.length] = numbers[(i)];
            }
        }

        return answer;
    }
    public static int[] solution2(int[] numbers, String direction) {
        //중복 제거 해봄
        int[] answer = new int[numbers.length];
        int directionInt = -1;
        if (direction.equals("left")) directionInt = 1;// 방향만 바꿈
        for (int i = 0; i < answer.length; i++) {
            //right 경우 인덱스가 음수가 나올수 있으니까 랭스 한번 더해서 나눈뒤 나머지값 구함!
            answer[i] = numbers[(i + directionInt + answer.length) % answer.length];
        }
        return answer;
    }
}
