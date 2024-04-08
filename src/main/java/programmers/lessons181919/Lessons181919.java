package programmers.lessons181919;

import java.util.Arrays;
import java.util.LinkedList;

public class Lessons181919 {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(Arrays.toString(solution(n)));
    }
    public static int[] solution(int n) {
        LinkedList<Integer> ansList = new LinkedList<>();
        int i = 0;
        ansList.add(n);
        while (true){
            i++;
            if (n%2==0){
                n /= 2;
            }else {
                n = 3*n+1;
            }
            if (n==1) {
                ansList.add(n);
                break;
            }
            ansList.add(n);
        }
        int[] answer = new int[i+1];
        for (int j = 0; j <= i; j++) {
            answer[j] = ansList.get(j);
        }
        return answer;
    }
}
