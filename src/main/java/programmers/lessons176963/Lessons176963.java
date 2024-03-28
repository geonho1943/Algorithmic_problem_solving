package programmers.lessons176963;

import java.util.HashMap;

public class Lessons176963 {
    public static void main(String[] args) {
        String[] name = {"may", "kein", "kain", "radi"};
        int[] yearning = {5, 10, 1, 3};
        String[][] photo = {{"may"},{"kein", "deny", "may"}, {"kon", "coni"}};
        System.out.println(solution(name, yearning, photo));
    }
    public static int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        HashMap<String, Integer> nToY = new HashMap<String, Integer>( );
        for (int i = 0; i < name.length; i++) {
            //이름-그리움점수 해시맵 만들기
            nToY.put(name[i],yearning[i]);
        }
        for (int i = 0; i < photo.length; i++) {
            //모든 사진의 각각 점수 구하기
            String[] temp = photo[i];
            int sum = 0;
            for (int j = 0; j < temp.length; j++) {
                //한 장당 총합 구하기
                if (nToY.containsKey(temp[j])){
                    sum += nToY.get(temp[j]);
                }

            }
            answer[i]=sum;
        }

        return answer;
    }
}
